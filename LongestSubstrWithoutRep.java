package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LongestSubstrWithoutRep {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> sub = new HashMap<>();
        int count = 0, j = 0;
        for (int i = 0; i < s.length(); i++) {
            for (j = i; j < s.length(); j++) {
                if (sub.get(s.charAt(j)) != null) {
                    break;
                }
                sub.put(s.charAt(j), j);
            }
            if (sub.size() > count)
                count = sub.size();
            sub.clear();
        }

        return count;
    }


    public static void main(String[] args) {
        LongestSubstrWithoutRep longest = new LongestSubstrWithoutRep();
        String s = "abcabcbb";
        System.out.println(longest.lengthOfLongestSubstring(s));
    }
}
