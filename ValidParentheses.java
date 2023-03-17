package leetcode;

import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {

    public Character findOpenParentsesis(Character par) {
        if(par == ')')
            return ('(');
        if(par == ']')
            return ('[');
        if(par == '}')
            return ('{');
        return par;
    }

    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' )
                parentheses.push(s.charAt(i));
            else{
                if(parentheses.isEmpty() || parentheses.peek() != findOpenParentsesis(s.charAt(i)))
                    return false;
                else
                    parentheses.pop();
            }
        }
        if(!parentheses.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        ValidParentheses valid = new ValidParentheses();
        System.out.println(valid.isValid("()"));
        System.out.println(valid.isValid("[]"));
        System.out.println(valid.isValid("{}"));
        System.out.println(valid.isValid("[]{}()"));
        System.out.println(valid.isValid("[][][]"));
        System.out.println(valid.isValid("(){}}{"));
        System.out.println(valid.isValid("([]){}"));
    }
}
