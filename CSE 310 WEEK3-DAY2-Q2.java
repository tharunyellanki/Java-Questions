/* Alex is very fond of pattern making so he is writing a program to print the pattern of following type .He gives an input of int type which represents the total number
of rows and the pattern will be printed up to the entered row size but if Alex enter the negative number ,show “Invalid Input”. Pattern for 2 rows: & && &&& */

// code for Q2

import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
            if(x<0)
            {
                System.out.println("Invalid Input");
            }
        else if(x>0)
        {
            int y=1;
            for(int z=0;z<x;z++)
            {
                for(int a=0;a<y;a++)
                {
                    System.out.print("&");
                }
                y++;
                System.out.println();
            }
        }
    }
}
