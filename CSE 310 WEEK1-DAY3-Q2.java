/*QUESTION 2
Alex has got a Mathematical assignment where he has to find whether a given integer N is a Perfect Cube or not.Write a Java program solution to help Alex*/

import java.io.*;
import java.util.*;

public class Solution 
{
      public static void main( String args[] )
      { 
        Scanner sc=new Scanner( System.in ); 
        int num=sc.nextInt(); 
       int n=(int) Math.round(Math.pow(num,1.0/3.0));
        if((num==n*n*n))
            {
               System.out.print("Perfect Cube");
            }
           else
            {
                System.out.print("Not Perfect Cube");
            }
       }
}
