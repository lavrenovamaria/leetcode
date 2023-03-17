package leetcode;

class LongestCommonPref {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder("");
        for(int i = 0;;i++){
            Character ch;
            try{
                ch = strs[0].charAt(i);
                for(int j = 0; j < strs.length; j++){
                    if(strs[j].charAt(i) != ch)
                        return str.toString();
                }
                str.append(ch);
            }
            catch (IndexOutOfBoundsException e){ break; }
        }
        return str.toString();
    }
}
