/* Mrs. Jhunjhunwala has taught Programming in Java to the second-year students in ICE college and conducted 3 academic tasks for all the (N) students. Marks are store in
a 2-D array but now Mrs. Jhunjhunwala is willing to implement a java program which can accept the 2-D array of marks and return the average marks of Best 2 Academic Tasks
of each student. Help her to implement a method public double[] average_marks(double [][] marks) */

//code for Q1

import java.util.Scanner;
import java.util.Arrays;

public class Solution 
{
    public static double[] average_marks(double[][] marks) 
    {
        int n = marks.length; 
        double[] avgs = new double[n];

        for (int i=0;i<n;i++) 
        {
            Arrays.sort(marks[i], 0, 3);
            double sum = marks[i][1] + marks[i][2]; 
            avgs[i] = sum/2; 
        }
        return avgs;
    }
    public static void main(String[] args) 
    {
        double[][] marks =
        {
            {10.5, 2.5, 15},
            {5.25, 6.75, 11.25}
        };
        double[] avgs = average_marks(marks);

        for (double avg : avgs) 
        {
            System.out.print(avg + " ");
        }
    }
}
