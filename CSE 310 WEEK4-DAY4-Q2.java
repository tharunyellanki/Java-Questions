/* Karan has been given a task by Head of Librarian to implement the enumeration of the Library working Day and timing. Which have the 3 attributes i.e. day and open 
timing and close timing of the library working hours. Details of the working hours are:
Day, open Timing, closed timing

Monday, 8.30, 5.30 Tuesday, 8.30, 5.30 . . Friday, 8.30, 5.30 Saturdays, 9.30, 4.30

Karan is supposed to write a main class in which the name of working days of library is taken as input as a day and timing of library should be displayed using 
switch statement. If the input given is not matching with the listed day, display Library is closed */

//code for Q2

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        switch(day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednsday":
            case "Thursday":
            case "Friday":
                    System.out.println("8:30 5:30");
                    break;
            case "Saturday":
                    System.out.println("9:30 4:30");
            break;
            default:
                  System.out.println("Library is closed");    
                break;
        }
    }
}

