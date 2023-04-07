/* In a class, the teacher while teaching word formation to students thaught of an activity where two participants are choosen from the class. Participant 1 is asked to 
speak any english word, the participant 2 is again asked the same. After 2 words are choosen, it is checked by the class whether the starting 3 characters of word match 
the ending three characters in reverse order. WRITE A PROGRAM code for the teacher to perform the activity and return the appropriate message. */

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int j = s2.length() - 1;
        boolean eq = true;
        
        if(s1.length()-4>=3)
        {
            for (int i = 0; i < 3 && i < s1.length(); i++) 
            {
            
            if (s1.charAt(i) != s2.charAt(j)) 
            {
                eq = false;
                break;
            }
                j--;
            }
            if(eq==true)
            {
                System.out.println("GREAT");
            }
            else
            {
                System.out.println("TRY NEXT TIME");
            }
       
        }
        else
        {
            System.out.println("ERROR");
        }
        
    }
}
