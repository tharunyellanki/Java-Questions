/*Shan is playing a game with little raghav. Shan provide a string and a char to raghav and raghav counts the occurrence of same char in the string. write a program to 
help the raghav to find the occurrence of the char in the string.*/
//code Q1

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char c= sc.nextLine().charAt(0);
        long count = s.chars().filter(ch->ch==c).count();
        System.out.println(count);
  }
}
