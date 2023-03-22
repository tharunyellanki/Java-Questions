/* Vijay and Gaurav are two friends. They are playing a game to check that whether the first word is similar to second or not. For example first word is "loop" and second
is "lloooopp". These words will be considered similar as characters are same and in first word 'l' is occuring 1 time, 'o' is 2 times and 'p' is 1 time i.e occurance of 
'l'= occurance of 'p' and occurance of 'o' is double than the occurance of 'l' and 'p'. Help them using program. */ 

//1Q Code

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int m=0,c=0;
        int n=0;
        String a=ob.next();
        String b=ob.next();
        if(a.length()!=b.length())
        {
            System.out.println("Not Similar");
            System.exit(0);
        }
        else if(a.length()<b.length())
        {
            n=b.length();
        }
        else
        {
            n=a.length();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    m++;
                }
            }
        }
        for(int i=0;i<(n/2);i++)
        {
            for(int j=(n-1);j>=(n/2);j--)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    c++;
                }
            }
        }
        if((m-c)==n)
        {
            System.out.println("Similar");
        }
        else
        {
            System.out.println("Not Similar");
        }
    }
}
