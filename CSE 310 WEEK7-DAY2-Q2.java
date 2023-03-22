/*  Puneet and Virat are playing a game. Virat tells a number that Puneet need to check whether that number is even and multiple of 13 or not. Write a program in which 
implement a method public boolean check(int n) which will return true if number satisfy the conditions else return false. */

//code for Q2

import java.util.Scanner;

public class Solution 
{
    
    public static boolean check(int n)
    {
        if(n%2==0&n%13==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>10&&n<500)
        {
            if(check(n))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
    }
}
