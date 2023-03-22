/* Tara has been assigned a task by her friends to retrieve a character that appears most number of the times in a given sequence.If the frequency of two or more 
characters is same than return the first character that occurs in the string among them. */

//code for Q1

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
      

        int[] freq = new int[128];

        for (int i = 0; i<str.length();i++) 
        {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) 
            {
                freq[ch]++;
            } 
            else 
            {
                System.out.println("Error");
                return;
            }
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < freq.length; i++) 
        {
            if (freq[i] > maxFreq) 
            {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Maximum occurring character is: " + maxChar);
    }
}
