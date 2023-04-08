/* It's PTM tomorrow in Cambridge School.Teachers want to show the grades from(A to E) depending on the percentage of the student. Help the teacher's by developing the
program for the same.To find the grade of a student, given the marks of N subjects. Given the marks of N subjects, we have to print the grade of a student based on the 
following grade slab.

If Percentage Marks > 90, Grade is A+ If 70 <= Percentage Marks <= 89, Grade is A If 60 <= Percentage Marks <= 69, Grade is B If 50 <= Percentage Marks <= 59, Grade is C 
If Percentage Marks <= 40, Grade is D */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=7){
            int marks[] = new int[n];
            for(int i=0;i<n;i++){
                marks[i]=sc.nextInt();
            }
            int total =0;
            for(int i=0;i<n;i++){
                total = total+marks[i];
            }
            int percent = (total*100)/(n*100);
            if(percent>90){
                System.out.print("A+");
            }
            else if(percent>=70 && percent<=89){
                System.out.print("A");
            }
            else if(percent>=60 && percent<=69){
                System.out.print("B");
            }
            else if(percent>=50 && percent<=59){
                System.out.print("C");
            }
            else {
                System.out.print("D");
            }
        }
        else{
            System.out.print("Invalid");
        }
    }
}
