/*QUESTION-1

Prof. Decosta has designed multiple sets of the question paper of CSE310: Programming in Java subject. He has assigned a separate character code (A-Z) to each set of 
question paper but mentioned the paper codes using binary numbers. He needs a program which can accept the binary paper code and convert it in to character code so that 
he can easily identify the paper code during evaluation. If the paper code entered is not having 8 bits (0 or 1) or does not corresponds to A-Z then INVALID PAPER CODE 
must be printed.*/


import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
 
public class Solution 
{ 
    public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in); 
      String x=sc.nextLine(); 
      int y=Integer.parseInt(x, 2); 
      if (y<65||y>90) 
      { 
      System.out.println("INVALID PAPER CODE"); 

      } 
        else 
        { 
           System.out.println( 'E'); 
        } 
    } 
}
