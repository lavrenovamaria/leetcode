package leetcode;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class RomanToInteger {
    public int romanToInt(String s){
        int res = 0;
        int i = 0;
        Map<String, Integer> roman = new HashMap<>() {{
            put("I", 1);
            ///put("III", 3);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }};
        while(i < s.length()){
            if(i + 1 < s.length() && roman.containsKey(s.substring(i, i + 2))){
                res += roman.get(s.substring(i, i + 2));
                i += 2;
            }
            else{
                res += roman.get(s.substring(i, i + 1));
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToInteger rom = new RomanToInteger();
        System.out.println(rom.romanToInt("III"));
    }
}
