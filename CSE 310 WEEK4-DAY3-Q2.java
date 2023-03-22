/* Alice got task from his manager to maintain 2 decks of n numbers. As he easily put n numbers in one deck but for second deck he is bit confused so help him by creating
one application in which once the n numbers are entered by bob, then parallely application will copy the content in second deck also */

//code for Q2

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        int n;
        n=obj.nextInt();
        int[] deck1 = new int[n];
        int[] deck2 = new int[n];

        for (int i=0;i<n;i++) 
        {
            int m=obj.nextInt();
            deck1[i]=m;
            deck2[i]=m;
        }

        for (int i=0;i<n;i++) 
        {
            System.out.print(deck1[i] + " ");
        }
        System.out.println();

        for (int i=0;i<n;i++) 
        {
            System.out.print(deck2[i] + " ");
        }
    }
}
