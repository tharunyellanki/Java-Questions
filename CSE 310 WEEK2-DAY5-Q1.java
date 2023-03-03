/* Liz built up a software code taking number of 3 different color blocks as input. Considering the end users can enter floating point numbers too as at least 1 block 
of a color is broken. Design the code converting the not-full numbers to full numbers.

Input Format

Number of balls for three different colors.

Constraints

3 inputs separated with space can be floating points or integers.

Output Format

3 integer numbers */

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x=(int)Math.ceil(sc.nextDouble());
        int y=(int)Math.ceil(sc.nextDouble());
        int z=(int)Math.ceil(sc.nextDouble());
        System.out.print(x+" "+y+ " "+z+" ");
    }
}
        
