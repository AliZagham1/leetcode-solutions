package Stack.validParentheses;

import java.util.Stack;

public class Solution {
    public Boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // initialize stack

        for (char c :s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') { // if the character is an opening bracket
                stack.push(c);
            } else {
                if (stack.isEmpty()) { // if the stack is empty and we encounter a closing bracket
                    return false;
                } else {
                    char top = stack.pop(); // if the stack is not empty and we encounter a closing bracket
                    if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) { // if the closing bracket does not match the opening bracket
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()) { // if the stack is empty after processing all characters
            return true;
        }
           return false;     

        }

    }
