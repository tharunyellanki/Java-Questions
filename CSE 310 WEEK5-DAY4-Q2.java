/*WAP to accpet one array of stings and integers.and count the number of stings and integers present in the array. Example Input: First line Accept size of array second 
line accept all elements like Array = {"Raj", "77", "101", "99", "Jio"}*/

import java.util.Scanner;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
