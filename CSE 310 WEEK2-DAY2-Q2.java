/*CSE 310 WEEK2-DAY 2 
QUESTION-2

Sonal built up a software code taking ratings on a product. The product is supposed to be rated between 1 to 5. Create a program displaying an error "101" if the rating 
is not between 1 to 5, else displaying "thanks".*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
  float r;
    r=obj.nextFloat();
        if(r>0&&r<5)
        {
    System.out.println("Thanks");
  
        }
        else
        {
                System.out.println("Error: 101");

        }
    }
}
