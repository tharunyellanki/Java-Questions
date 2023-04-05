/* Write a program to take "n" String inputs from user and store them in array (where "n" is no. of String objects specified by user at run-time). Sort the array in 
ascending order and display the array. If "n" entered by user is less than 2, then display message "Invalid". */ 

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n<2)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        String[] arr = new String[n];
        for (int i=0;i<n;i++) 
        {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);

        for (String s:arr) 
        {
            System.out.println(s);
        }
    }
}
