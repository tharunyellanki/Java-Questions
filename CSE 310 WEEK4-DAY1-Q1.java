/* Jeevan has been given a task by his Java professor Mrs. Shruti to create an enum of the subjects which he is studying in current semester. It is also instructed 
that there must be 2 attributes of each Subject i.e. Faculty Name and credits(int) of the subject. Details of the subjects are:

**Subject, Credits, Faculty Name **

Java, 4, Shruti OS, 3, Puneet Kumar AI, 2, James William Android, 3, Md. Adil Khan

Jethalal is supposed to write a main class in which the name of subject is taken as input and the faculty name and credits of that subject should be displayed using 
switch statement. If the input given is not matching with the listed subjects, display This subject is not running in this semester. */

//code for Q1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    switch(s)
    {
        case "Android":
            {
                System.out.println("Md. Adil Khan"+" "+"3");
            }
            break;         
        case "Java":
             {
                System.out.println("Shruti"+" "+"4");
             }
                break;     
        case "OS":
            {
                  System.out.println("Puneeth Kumar"+" "+"3");
            }
            break; 
            case "AI":
            {
                System.out.println("James William"+" "+"2");
            }
            break; 

        default :
        {
            System.out.println("This subject is not running in this semester.");
        }
        break;
    }
    }
}
