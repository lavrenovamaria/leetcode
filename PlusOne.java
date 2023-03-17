package leetcode;

import java.util.Arrays;

public class PlusOne {
    static int[] intToArray(int n) {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        return arr;
    }
    public int[] plusOne(int[] digits) {
        double res = 0;
        for (int i = 0; i < digits.length; i++)
            res = res * 10 + digits[i];
        res = res + 1;
        return intToArray((int)res);
    }

    public static void main(String[] args) {
        PlusOne pl = new PlusOne();
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(pl.plusOne(arr)));
    }
}
