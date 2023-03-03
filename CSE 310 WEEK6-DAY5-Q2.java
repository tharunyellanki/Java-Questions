/* Write a program to make "Employee" class consisting of following: -- instance variables --> id & age -- a parameterized constructor to initialize both instance 
variables. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Employee
 {
     int id; int age;
     Employee(int id,int age)
     {
         this.id=id;
         this.age=age;
     }
     public int getid()
     {
         return id;
     }
     public int getage()
     {
         return age;
     }
 }

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(); 
        Employee[] a=new Employee[k];
        if(k<1||k>10)
        {
            System.out.println("Invalid input");
            return;
        }
        for(int i=0;i<k;i++){
            int id=sc.nextInt();
            int age=sc.nextInt();
            
            if(id<10||id>1000||age<18||age>50)
            {
                System.out.println("Invalid data");
                return;
            }
            
            a[i]=new Employee(id,age);
        }
        
        int minage=Integer.MAX_VALUE;
        
        for(Employee emp:a){
            if(emp.getage()<minage)
            {
                minage=emp.getage();
            }
        }
        for(Employee emp:a)
        {
            if(emp.getage()<30&&emp.getage()==minage)
            {
                System.out.println(emp.getid()+ " " +emp.getage());
            }
        }
    }
}
