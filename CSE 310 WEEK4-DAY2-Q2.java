/* Akash got a new coin game. In the coin game, Akash will only win the game if the total count is 56. Each coin will have value inscribed. Write a programming solution,
to help Akash in counting total value of coins at the end of the game. Coin Game is played N times */

// code for Q1

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  int p=0;
        int[][] ar=new int[n][7];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<7;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<7;j++)
            {
                p=p+ar[i][j];
            }

            if(p==56){
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}
