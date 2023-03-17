package leetcode;

import java.math.BigInteger;
import java.math.*;

public class MyAtoi {

    static public boolean isSpace(Character c){
        return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }

    public int atoiItself(String s){

        double res = 0;
        int	i = 1;
        int j = 0;

        while (j < s.length() && isSpace(s.charAt(j))) {
            j++;
        }
        if(s.length() == j)
            return 0;
        if(s.charAt(j) == '-'){
            i = -1;
            j++;
        }
        else if(s.charAt(j) == '+'){
            j++;
        }
        while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9'){
            res = res * 10 + (s.charAt(j) - '0');
            j++;
        }
        res *= i;
        if(res < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(res > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)res;
    }

    public static void main(String[] args) {
        MyAtoi result = new MyAtoi();
        String s = "9223372036854775808";
        System.out.println(result.atoiItself(s));
        // System.out.println('5' - '0');
    }
}
