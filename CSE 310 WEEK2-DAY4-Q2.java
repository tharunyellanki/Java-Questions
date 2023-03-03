/* Arjun asked to his friend to write a java program to accept a two-digit number.

The Addition of the sum of its digits and the product of its digits.

If the value is equal to the number input, then display the message "special two digit number" otherwise, display the message "not a special two digit number".

If the value is not two digit number than display the message "invalid input"

Sample 1: Line 1 : Enter two digit number: 25 Line 2 : Not a special two digit number

Sample 2: Line 1 : Enter two digit number: 59 Line 2 : Special two digit number

Sample 3: Line 1 : Enter two digit number: 5 Line 2 : Invalid input */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 sc.next();
 sc.next();
 sc.next();
 sc.next();
 int n=sc.nextInt();
 int o=n;
 int i=0;
 int sum=0,pro=1,m,p;

 while(n>0)
 {
 m=n%10;
 p=m;
 pro=pro*m;
 sum+=m;
 n=n/10;
 i++;
 }
     if(o<10||o>99)
 {
 System.out.println("Invalid Input");
         return;
 }
     if((sum+pro)==o)
 {
     System.out.println("Special two digit number");
     }
 else{
 System.out.println("Not a special two digit number");

 }
 }
}
