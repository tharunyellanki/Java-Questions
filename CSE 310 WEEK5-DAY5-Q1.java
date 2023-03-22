/* It's PTM tomorrow in Cambridge School.Teachers want to show the grades from(A to E) depending on the percentage of the student. Help the teacher's by developing the 
program for the same.To find the grade of a student, given the marks of N subjects. Given the marks of N subjects, we have to print the grade of a student based on the 
following grade slab. */

//code for Q1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        int total=0;
        if(n>7){
            System.out.println("Invalid");
        }
        else{
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            total +=marks[i];
        }
        float per=total/(float)n;
        if(per>=90.0){
            System.out.println("A+");
        }
        else if(per>=70.0&&per<=89.0){
            System.out.println("A");
        }
        else if(per>=60.0&&per<=69.0){
            System.out.println("B");
        }
        else if(per>=50.0&&per<=59.0){
            System.out.println("C");
        }
        else if(per<40.0){
            System.out.println("D");
        }
    }
}
}
