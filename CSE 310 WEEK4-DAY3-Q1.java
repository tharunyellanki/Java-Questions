/* Write a program to find second largest element of int type array. If any value in the input array will be negative, display the message “Invalid Array Elements” 
otherwise display the second largest element. */

//code for Q1

import java.util.Arrays;
import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        if (size <= 0) 
        {
            System.out.println("Invalid Array Size");
            return;
        }
        int[] arr = new int[size];
        for (int i=0;i<size;i++) 
        {      
            arr[i] = sc.nextInt();        
            if (arr[i] < 0) 
            {
                System.out.println("Invalid Array Elements");
                return;
            }
        }     
        Arrays.sort(arr);
        int s = arr[size-2];
        System.out.println(s);
    }
}
