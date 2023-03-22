/* Consider that in a plantation activity, the municipality is planting trees in an order such that the smallest tree is planted first and the biggest at the end. 
While arranging the trees, before planting, to position them at their positions, they are swapped in such a way that a tree can only be swapped with its adjacent trees.
wAP to implemennt the same using method which contain the logic of sorting. Consider 10 trees height as input. */

//code for Q2

import java.util.Scanner;
public class TreeSort 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[10]; 
        for (int i=0;i<10;i++) 
        {
            h[i] = sc.nextInt();
        }
        for (int i=0;i<9;i++) 
        {
            for (int j=0;j<9-i;j++) 
            {
                if (h[j] > h[j+1]) 
                {
                    int temp = h[j];
                    h[j] = h[j+1];
                    h[j+1] = temp;
                }
            }
        }
        for (int i=0;i<10;i++) 
        {
            System.out.print(h[i] + " ");
        }
    }
}
