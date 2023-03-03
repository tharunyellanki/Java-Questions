/*Create a method named ‘factorial’ in your program that will display the factorial of any given number. factorial of an integer is the product of numbers ranging from 
1 to N*/


import java.util.Scanner;
public class solution 
{
    public static int factorial(int n) 
    {
        if (n==0) 
        {
            return 1;
        } 
        else 
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) 
    {
        int n=2;
        int result = factorial(n);
        System.out.println(result);
    }
}
