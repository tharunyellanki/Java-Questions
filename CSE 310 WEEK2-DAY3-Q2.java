/*CSE 310 WEEK2-DAY3-Q2

A student will not be allowed to sit in exam if his/her attendence is less than 75%. Take following input from user Number of classes held Number of classes attended.
And print percentage of class attended Is student is allowed to sit in exam or not.*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=(y*100)/x;
        if(z>=75)
        {
            System.out.println(z);
            System.out.println("Yes");
        }
        else if(z<75)
        {
            System.out.println(z);
            System.out.println("No");
        }
    }
}
