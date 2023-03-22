/* write a program that creates integer array of n elements, accepts the values of arrays and find sum of elements as an integer. */

//code for Q1

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++) 
        {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
