/* In some organization, January is the month of giving appraisal to employees, so HR department of that organization decided to give appraisal to only those employees
whose employee id is more than 201. In that organization every employee is getting basic salary is 20,000INR and when employee id is greater than 201 then company decides
to give appraisal of 1000INR to every employee. So as a programmer help that company to check who is eligible for getting incentive. */

//code for Q2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int empid=scanner.nextInt();
        scanner.nextLine();
        String name=scanner.nextLine();
        String post=scanner.nextLine();
        if(empid<=201)
        {
            System.out.println("No Appraisal");
        }
        else
        {
            System.out.println(name+","+empid+","+"21000");
        }
    }
}
