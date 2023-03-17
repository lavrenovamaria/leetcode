package leetcode;

public class Container {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area = 0;
        int prevArea = 0;

        for(int i = 0, j = height.length - 1; i < j;){
            area = (j - i) * Math.min(height[i], height[j]);
            if(area > maxArea){
                prevArea = maxArea;
                maxArea = area;
            }
            if(height[i] <= height[j])
                i++;
            else if(height[j] <= height[i])
                j--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Container cont = new Container();
        int[] contain = {5,5};
        System.out.println(cont.maxArea(contain));
    }
}
