/*Peter has been given an assignment to implement the code to convert the temprature from FORENHITE to CELCIUS and vice versa. Kindly help him to implement the code such 
that user can choose the conversion type

FORENHITE to CELCIUS CELCIUS to FORENHITE and then enter the value of temperature to be converted and display the temptrature in the appropriate format.

If user enters the choice any thing else then print INVALID CHOICE*/


import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        Double b=sc.nextDouble();
        if(a==1)
        {
            b=(b-32) * 5/9;
            System.out.format("%.2f",b);
        }
         else if(a==2)
         {
             b=(b*9/5)+32;
             System.out.println(b);
         }
         else
         {
             System.out.println("INVALID CHOICE");
         }
    }
}
