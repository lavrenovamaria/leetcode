package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++)
                if ((nums[i] + nums[j]) == target){
                    res[0] = i;
                    res[1] = j;
                }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] myIntArray = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(myIntArray, target)));
    }
}
