/*CSE 310 WEEK2-DAY 2 
QUESTION-1

Write a program to take one input of int type from the user. If the value is positive convert it into double and display it, otherwise display the message “Invalid Input”
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=a;
        
        if(b<0)
        {
            System.out.println("Invalid Input");
}
        else
        {
            System.out.println(b);
}
    }
}
