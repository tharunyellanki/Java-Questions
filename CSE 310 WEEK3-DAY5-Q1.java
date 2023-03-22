/* Peter logins into his banking application to perform certain transaction. Initially he is asked to enter his present balance. Then he is shown three options to choose
from, where he is asked to choose 1 for withdrawal and 2 for deposit and 3 to check the balance. On choosing 1, he is prompted to enter amount to be withdrawn. In case
if the amount entered is greater than his present balance, "error" should be displayed, the account balance should be updated otherwise. On choosing 2, he is prompted 
to enter amount to be deposited and the account balance should be updated. Choosing 3 should display the balance. Choosing any other option should display "error". */

// code for Q1

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        int b=sc.nextInt();
        if(b==1)
        {
            double c=sc.nextDouble();
            a=a-c;
            System.out.printf("%.2f",a);
        }
        else if(b==2)
        {
            double c=sc.nextDouble();
            a=a+c;
            System.out.printf("%.2f",a);
        }
        else
        {
            System.out.print("Error");
        }
    }       
}
