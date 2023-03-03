2ND QUESTION

/*Peter asked his friend Max to implement a Java program in which 3 integers X, Y and N are given as a runtime input and all the numbers between X and Y which are 
divisible by N must be displayed on console. If no such number is possible for the given input then, print NO OUTPUT.*/


import java.io.*;
import java.util.*;

public class Division
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        boolean k = false;
        for (int i = x; i <= y; i++) 
        {
            if (i % n == 0)
            {
                System.out.print(i + " ");
                k = true;
            }
        }
        if (!k) 
            System.out.println("NO OUTPUT");
    }
}
