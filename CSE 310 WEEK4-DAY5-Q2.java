/* Jasmine and jack created 2 different arrays to store their products which they have purchased from super market. Then they compared their products to identify the 
count of similar products they have purchased */

// code for Q2

import java.io.*;
import java.util.*;

public class Solution 
{
        public static void main(String[] args) 
        {
             Scanner sc=new Scanner(System.in);
            String []m=new String [4];
            String []n=new String [4];
            int c=0;
            for(int i=0;i<4;i++)
            {
                 m[i]=sc.next();
            }
            for(int i=0;i<4;i++)
            {
                n[i]=sc.next();
            }
            for(int i=0;i<4;i++)
            {
                 for(int j=0;j<4;j++)
                 {
                        if((m[i].equals(n[j])))
                        {
                             c++;
                        }
                 }
            }
            System.out.println(c);
            }
}
