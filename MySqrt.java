package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MySqrt {
    public int mySqrt(int n) {
        //Babylonian method
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
//        for(int i = 1; i <= x; i++){
//            if(i * i == x)
//                return i;
//            else if(i * i > x)
//                return i - 1;
//        }
//        return 0;

    }

    public static void main(String[] args) {
        MySqrt sq = new MySqrt();
        System.out.println(sq.mySqrt(16));
//        System.out.println(sq.mySqrt(21474836));
//        System.out.println(sq.mySqrt(2147395600));
//        System.out.println(sq.mySqrt(2147483647));
    }
}
