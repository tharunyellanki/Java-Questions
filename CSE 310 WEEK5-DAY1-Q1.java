/* Write a program to make "Employee" class consisting of following: -- instance variables --> id & age -- a parameterized constructor to initialize both instance 
variables.

Create array of "n" Employee objects (where"n" is no. of objects specified by user at run-time) and display the id and age of those employees whose age is less than 30.*/

//code for Q1

import java.util.Scanner;

class Employee 
{
    int id;
    int age;

    Employee(int id, int age) 
    {
        this.id = id;
        this.age = age;
    }
}
public class Emp
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if (n<1||n>10) 
        {
            System.out.println("Invalid input");
        }
        else 
        {
            Employee[] emp = new Employee[n];
            for (int i=0;i<n;i++) 
            {
                int id = sc.nextInt();
                int age = sc.nextInt();
                emp[i] = new Employee(id, age);
            }
            for (int i = 0; i < n; i++) 
            {
                if (emp[i].age<30)
                {
                    System.out.println( emp[i].id + " " + emp[i].age);
                }
             }
        }
    }
}
