/*WEEK1-DAY 2 
1 QUESTION
//  Jeevan got an assignment where he need to determine whether a given integer is prime number or not. Write a java programming solution to help Amit.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i,j,k=0;
        Scanner obj=new Scanner(System.in);
        
         i=obj.nextInt();
        for(j=2;j<i;j++)
        {
    if((i%j)==0)
    {
       k=1;
    }
        }
        if(k==1)
        {
            System.out.println("Not Prime Number");
        }
        else
        {
            System.out.println("Prime Number");
        }
    }
}
