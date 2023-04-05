/* Riya asked her friend to make calculator using nested class using the following operation. 1. The outer class name is Outer_Calculator 2. The inner class name is 
static Inner_Calculator with four method addition , subtraction , multiplication and division. 3. Write main method under the class of Outer_Calculator.

if the input is integer than display the massage as "invalid input" and if the operator is not valid operator than display the massage as "invalid operator". */

//code for Q2

import java.util.Scanner;

public class Calculator 
{

    static class Cal
    {
        public static int add(int a, int b) 
        {
            return a+b;
        }
        public static int sub(int a, int b) 
        {
            return a-b;
        }
        public static int mul(int a, int b) 
        {
            return a*b;
        }

        public static int div(int a, int b) 
        {
            return a/b;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();

        int result;

        switch(operator) 
        {
            case "+":
                result = Cal.add(a,b);
                break;
            case "-":
                result = Cal.sub(a,b);
                break;
            case "*":
                result = Cal.mul(a,b);
                break;
            case "/":
                result = Cal.div(a,b);
                break;
            default:
                System.out.println("invalid operator");
                return;
        }
        System.out.println(result);
    }
}
