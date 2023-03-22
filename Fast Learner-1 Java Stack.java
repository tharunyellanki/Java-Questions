/* In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which
adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) 
and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not. */ 

import java.util.*;

class Solution
{
    
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        
        while (obj.hasNextLine()) 
        {
            String b = obj.nextLine();
            System.out.println(isBalanced(b));
        }
    }
    public static boolean isBalanced(String b) 
    {
        Stack<Character> stack = new Stack<>(); 
        for (char c : b.toCharArray()) 
        {
            if (c == '(' || c == '{' || c == '[') 
            {
                stack.push(c);
            }
            else 
            {
                if (stack.isEmpty()) 
                {
                    return false; 
                }
                char top = stack.peek(); 
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) 
                {
                    stack.pop(); 
                } else {
                    return false; 
                }
            }
        }
        return stack.isEmpty(); 
    }
}
