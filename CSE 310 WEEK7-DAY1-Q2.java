/* Chacha Chaudhary has asked Sheena to find out the Nth occurence of any Word in the Paragraph. Sheena finds it a tedious task to find Nth occurence so she wants you to
write a small java program which can solve her problem and she will give you a gift for helping her. Let us write a code. */

//code for Q2

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine().toLowerCase();
        String word = sc.next().toLowerCase();
        int n = sc.nextInt();

        if (n <= 0) 
        {
            System.out.println("Incorrect Input");
            return;
        }
        int count = 0;
        int index = -1;
        int lastOccurrenceIndex = -1;

        while (true) 
        {
            index = paragraph.indexOf(word, index + 1);
            if (index == -1) 
            {
                break; 
            }
            count++;
            if (count == n) 
            {
                System.out.println(index);
                return;
            }
            lastOccurrenceIndex = index;
        }
        if (count == 0) 
        {
            System.out.println("Not Present");
            return;
        }
        System.out.println(lastOccurrenceIndex);
    }
}
