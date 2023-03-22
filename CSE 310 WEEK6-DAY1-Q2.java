/* Accpet one array of stings with all alphabets or integers string and count the number of alphabets or integers string present in the array. */

//code for Q2

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid");
            return;
        }
            
        String[] array = new String[n];
        for (int i=0;i<n;i++) 
        {
            array[i] = sc.next();
        }
        int numIntegers = 0;
        int numStrings = 0;
        for (int i=0;i<n;i++) 
        {
            if (array[i].matches("\\d+")) 
            { 
                numIntegers++;
            } 
            else 
            {
                numStrings++;
            }
        }
        System.out.println(numIntegers);
        System.out.println(numStrings);
    }
}
