/* Neha and Nisha are playing a game .Nisha ask Neha to enter the number N from given range of 0 to 99 .Now Nisha need to print the number till N and once it exceed the
number from N then Print "Games End".If Neha enter the number less then 0 print Invalid input. */ 

//code for Q2

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        if(a>=0)
        {
            for(int b=0;b<a+1;b++)
            {
                System.out.println(b);
            }
            System.out.println("Games End");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
    }
}
