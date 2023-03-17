package leetcode;

public class LongestPalindromicSubstring {
    public boolean isPalindrome(String s) {
        int middle = s.length() / 2;
        for (int i = 0; i < middle; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
//левый меньше или равен правому

    public String longestPalindrome(String s) {
        //подстрока палиндрома в строке
        //палиндром - строка, которая читается одинаково справа налево и слева направо
        //подстрока - часть строки
        //подстрока палиндрома - часть строки, которая является палиндромом
        //найти самую длинную подстроку палиндрома в строке
        //пример: "abcbaa" -> "abcba"
        //пример: "cbbd" -> "bb"
        String maxSubstring = "";
        int len = s.length();
        int start = 0;
        int end = len - 1;
        if (len == 1)
            return s;
        if (len == 2)
            if (s.charAt(0) == s.charAt(1))
                return s;
            else
                return s.substring(0, 1);
//        if (!isPalindrome(s))
//            return s.substring(0, 1);
        while (start < len) {
            while (end > start) {
                if (isPalindrome(s.substring(start, end + 1)) && s.substring(start, end + 1).length() > maxSubstring.length())
                    maxSubstring = s.substring(start, end + 1);
                --end;
            }
            ++start;
            end = len - 1;

        }
        return maxSubstring;
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        //String s = "abcbaa";
        String s = "babad";
        System.out.println(lps.longestPalindrome(s));
    }
}
