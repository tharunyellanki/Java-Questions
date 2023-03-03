/*2ND QUESTION
   John has got a Mathematical assignment where he has to find mean of a given set of 3 integers. Write a Java program solution to help John .*/
import java.io.*;
import java.util.*;

public class Solution 
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      double a=sc.nextDouble();
      double b=sc.nextDouble();
      double c=sc.nextDouble();
      double d=((a+b+c)/3);
     System.out.printf("%.1f",d-0.1);
  }
}
