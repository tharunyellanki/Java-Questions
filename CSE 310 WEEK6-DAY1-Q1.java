/* Richa and her daughter Ahaana are playing a game. Richa is going to tell one number and Ahaana need to tell the prime factors of the number. Help Ahaana by completing
the code to find prime factor of the number. Write a method which calculate prime factors and print and call the method in main. */

//code for Q1

import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        if (n<10||n>50) 
        {
            System.out.println("Invalid");
        } 
        else 
        {
            List<Integer> factors = getPrimeFactors(n);
            for (int factor : factors) 
            {
                System.out.print(factor + " ");
            }
        }
    }
    
    public static List<Integer> getPrimeFactors(int n) 
    {
        List<Integer> factors = new ArrayList<>();
        for (int i=2;i<=n;i++) 
        {
            while (n%i==0) 
            {
                factors.add(i);
                n/=i;
            }
        }
        return factors;
    }
}
