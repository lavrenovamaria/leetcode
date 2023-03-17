package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int num1 = 0, num2 = 1;
        if (n == 1) {
            return 1;
        } else if (n <= 2) {
            return 2;
        }
        else {
            for (int i = 1; i <= n; ++i) {
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
            }
            return num2;
        }
    }

    public static void main(String[] args) {
        ClimbingStairs climb = new ClimbingStairs();
        System.out.println(climb.climbStairs(6));
    }
}
