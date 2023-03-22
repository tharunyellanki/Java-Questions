/* Write a program to make "Circle" class consisting of following: -- radius --> of double datatype -- parameterized constructor to initialize radius 
variable -- getArea() --> returns area of Circle of double datatype (formula: 3.14 * radius * radius)

Create array of "n" Circle objects (where "n" is no. of objects specified by user at run-time) and display the area of those Circle-objects whose area is greater than 
30.0. */

//code for Q2

import java.util.Scanner;

public class Circle 
{
    private double r;
    public Circle(double r) 
    {
        this.r = r;
    }
    public double getArea() 
    {
        return 3.14*r*r;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        Circle[] circles =new Circle[n];

        for (int i=0;i<n;i++) 
        {
            double r = sc.nextDouble();
            circles[i] = new Circle(r);
        }
        for (int i=0;i<n;i++) 
        {
            double a = circles[i].getArea();
            if (a>30.0) 
            {
                System.out.format("%.4f",a);
            }
        }
    }
}
