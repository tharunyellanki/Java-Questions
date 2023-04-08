/* Sushant and Virat are playing a game. Virat tells 2 numbers to Sushant, who need to check whether the first is bigger than second. Implement a method boolean 
isBigger(int a, int b) which returns true if a is bigger than b and false otherwise.*/

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m>=10 && m<=1000 && n>=10 && n<=1000) 
        {
            boolean result = isBigger(m,n);
            System.out.println(result);
        } 
        else 
        {
            System.out.println("Invalid Input");
        }
    }
    public static boolean isBigger(int m, int n) 
    {
        return m>n;
    }
}
