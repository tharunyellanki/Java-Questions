/* Write a program to check whether two strings are ANAGRAM or not. Strings will be anagram if they have same set of characters same number of times. Your program should 
take the input of two strings of length greater than 2. If the length of the any string is less than equal 2 then display the message “Invalid Input” without taking any 
more input */

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char ch1[] =str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean a = true;
        if(ch1.length==ch2.length && ch1.length>2)
        {
            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    a = false;
                    break;
                }
            }
            if(a==true)
            {
                System.out.println("ANAGRAM");
            }
            else
            System.out.println("NOT ANAGRAM");
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
