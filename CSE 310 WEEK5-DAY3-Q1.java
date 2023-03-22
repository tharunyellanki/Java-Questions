/* Create a class Student with attributes name(String) and registrationNo(int) and a method show to display the attributes of the Student. Write a menu driven program 
with 2 choices to take the input of the student attributes and display the attributes. */

// code for Q1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student
{
    String name;
    int regNo;
    void display()
    {
        System.out.println(name+","+regNo);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        Student s1=new Student();
        switch(choice)
        {
            case 1:
                scanner.nextLine();
                s1.name=scanner.nextLine();
                do{
                    s1.regNo=scanner.nextInt();
                }while(s1.regNo<=0);
            case 2:
                s1.display();
                break;
            default:
                System.out.println("Invalid");
        }
        
    }
}
