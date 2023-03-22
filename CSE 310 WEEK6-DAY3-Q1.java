/* Write a program to print the names of students by creating a Student class. If instead of name some other data type is passed then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating object of Student class. */

//code for Q1

import java.util.Scanner;

public class Student 
{
    private String name;

    public Student(String name) 
    {
        if (name.matches("[a-zA-Z]+")) 
        {
            this.name = name;
        } 
        else 
        {
            this.name = "Unknown";
        }
    }

    public String getName() 
    {
        return name;
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        String nameInput = sc.nextLine().trim();
        
        Student s1 = new Student(nameInput);
        System.out.println(s1.getName());

        String otherInput = sc.nextLine().trim();
        
        Student s2 = new Student(otherInput);
        System.out.println(s2.getName());

    }
}
