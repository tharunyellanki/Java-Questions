/*  Suppose that you want to write a program to calculate the marks of a student of all his subjects that he has learnt in a particular semester. Take the input from the
user which will ask him to enter no. of subjects he has learnt. If the input given is greater than 0, then program should ask the user to enter the marks of each 
subject. After entering all the marks, calculate and print total marks scored by him in all subjects. If the input given is negative or zero, then display the message 
“Invalid”. */

// code for Q2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[5];
        int sum=0;
        if(n>0)
        {
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();  
        }
         for(int i=0;i<n;i++)
         {
             sum=sum+a[i];
         }
        System.out.print(sum);  
    }
    else
    {
                System.out.print("Invalid");

    }
    }
}
