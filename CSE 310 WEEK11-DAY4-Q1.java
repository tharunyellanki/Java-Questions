/* Raju, Rohit and Ramesh were playing a game where Raju instructs Rohit to open and close two pairs of parenthesis bracket and place your name inside the bracket tags 
then Rohit instructs Ramesh to open and close three pairs of curly brackets and place your name inside the bracket tag then at last Ramesh instructs Raju to open and 
close four pairs of square brackets and place your name inside the bracket tag. */

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        for(int i=0;i<=s1.length();i++)
        {
            if(s1.charAt(i)=='('||s1.charAt(i)=='{')
                System.out.print(s1.charAt(i));
            else
            {
                System.out.print(s2);
                for(int j=i;j<s1.length();j++)
                    System.out.print(s1.charAt(i));
                break;
            }
        }
    }
}
