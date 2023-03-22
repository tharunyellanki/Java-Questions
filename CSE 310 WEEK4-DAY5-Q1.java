/* Prof. Joe has asked his student Pappu Singh to implement a Java program which can calculate the average CA marks of all the subjects that Pappu is studying in this 
semester using 2-D Array/ Jagged Array.

There are N number of subjects and different subjects may have different number of Academic Tasks (each with maximum marks 10)

Prof. Joe is expecting that all the CA marks are stored in the array and average marks of any subject can be checked randomly. */

// code for Q1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 double[][] caMarks=new double[n][];
 for (int i=0;i<n;i++) {
 int CA=sc.nextInt();
 caMarks[i]=new double[CA];
 for (int j=0;j<CA;j++) {
 caMarks[i][j]=sc.nextDouble();
 }
 }
 int subject=sc.nextInt();
 double sum=0;
 int CA=caMarks[subject-1].length;
 for (int i=0;i<CA;i++) {
 sum=sum+caMarks[subject-1][i];
 }
 double average=sum/CA;
 System.out.println("Average in Subject-" + subject+ " is " + average);

 }
}

