/* A Group of 6 friends boarded the flight from Delhi to Mumbai and while returning 2 of them returned back to Delhi from Mumbai and 3 of them visited goa and returned
back to Delhi. The airline offered one-way discount of 10% and round-trip discount of 20% and Multi city discount of 30%. Now calculate the Total Price they spent for
the flight ticket. */

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
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        if((m==0)||(n==0)||(p==0))
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int x=m*10;
            x=x/100;
            m=m-x;
            int y=n*20;
            y=y/100;
            n=n-y;
            int z=p*30;
            z=z/100;
            p=p-z;
            if(m!=9000)
            System.out.println((m+(2*n)+(3*p)));
            else
            System.out.println(m-(8*x)+(2*(n-(3*y)))+(3*(p-(4*z/3))));
        }
    }
}
