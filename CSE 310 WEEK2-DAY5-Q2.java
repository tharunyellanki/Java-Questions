/* Write a program to take one input of double type from the user. If the value is positive convert it into int and display it, otherwise display the message 
“Invalid Input”.

Input Format

Your program should take one input of double type

Constraints

Input should be positive double number

Output Format

If the input value is positive number (including 0) display the value in int type otherwise display the message “Invalid Input”. */


import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        int y=(int)x;
            if(x>0)
            {
                System.out.println(y);
            }
            if(x<0)
            {
                System.out.println("Invalid Input");
            }
    }
}
