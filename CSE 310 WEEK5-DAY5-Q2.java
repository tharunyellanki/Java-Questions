/* Sushant and Virat are playing a game. Virat tells 2 numbers to Sushant, who need to check whether the first is bigger than second. Implement a method boolean 
isBigger(int a, int b) which returns true if a is bigger than b and false otherwise. */

//code for Q2

import java.io.*;
import java.util.*;


public class Solution {
     public static boolean isBigger(int a,int b){
         if(a>b){
             return true;
         }
         else{
             return false;
         }
     }

    public static void main(String[] args) 
    {
        

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean c= isBigger(a,b);
        System.out.println(c);
    }
}
