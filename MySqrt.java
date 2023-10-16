package leetcode;

public class MySqrt {
    public int mySqrt(int n) {
        if(n == 0)
            return 0;
        double x = n;
        double y = 1;
        double e = 0.000001;
        while(x - y > e){
            x = (x + y) / 2;
            y = n / x;
        }
        return (int)x;
    }

    public static void main(String[] args) {
        MySqrt sq = new MySqrt();
        System.out.println(sq.mySqrt(16));
    }
}
