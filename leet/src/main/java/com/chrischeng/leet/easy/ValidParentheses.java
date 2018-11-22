package com.chrischeng.leet.easy;

/**
 * Valid Parentheses
 *
 * Description
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 *
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 *
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 *
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 *
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    private static boolean isValid(String str) {
        int length = str.length();
        if (length % 2 != 0)
            return false;

        Character[] array = new Character[length];
        int top = 0;
        for (Character c : str.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    array[top] = c;
                    top++;
                    break;
                case ')':
                    if (array[--top] != '(')
                        return false;
                    break;
                case ']':
                    if (array[--top] != '[')
                        return false;
                    break;
                case '}':
                    if (array[--top] != '{')
                        return false;
                    break;
            }
        }

        return true;
    }
}
