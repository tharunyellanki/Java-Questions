/* Mr. Ultalal is very intelligent person and He has a habit to read every word in reverse order. One day he went to book store the buy a book But in book all the 
paragraphs / sentences were written in regular word. So help Mr. Ultalal to read a book using java code in reverse order. The code accepts a string and display the new 
string after reversing each character of the word in lower case. If the string contains number or string is null then display the massage “Invalid input” */

//code for Q2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str == null || str.matches(".*\\d.*")) 
        {
            System.out.println("Invalid input");
            return;
        }

        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word.toLowerCase()).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }
}
