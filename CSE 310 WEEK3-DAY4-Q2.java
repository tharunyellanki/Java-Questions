/* Rahul borrowed an amount from his friend and he needs to repay the total amount within a year with additional interest of 10%. Find the total amount and emi that 
Rahul has to pay. */

// code for Q2

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution 
{

    public static void main(String[] args) 
    {
            Scanner sc =new Scanner(System.in);
            double BA = sc.nextDouble(); // Barrowed Amount-->BA
            double interest = BA*0.1; 
            double totalAmount = BA+ interest;
            double EMI = totalAmount / 12;

            DecimalFormat df = new DecimalFormat("#.##");
                System.out.println((int) totalAmount);
                System.out.println(df.format(EMI));
  }
}
