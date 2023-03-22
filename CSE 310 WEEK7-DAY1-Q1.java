/* Dr. Max has conducted the academic task in his class with 5 Multiple Choice Questions each having 4 options A/B/C/D. He wanted to write a program which can evaluate 
the test papers of all the N students such that each correct answer is awarded 1 mark and for incorrect answer penalty is 0.25 marks.

The program must read the number of students N and the the answers of all the N students in the form of a String. If any question is not attempted by any student, then 
X should be given as input corresponding to that question e.g. ABAXD

It is expected that the marks of all the N students are displayed separated by SPACE. */

//code for Q1

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        String CAns=sc.nextLine().toUpperCase();

        int n=sc.nextInt();
        sc.nextLine(); 

        for (int i=0;i<n;i++) 
        {
            String Ans = sc.nextLine().toUpperCase();
            if (Ans.length() != CAns.length()) 
            {
                System.out.println("Incorrect Input");
                return;
            }

            double marks = 0;
            for (int j = 0; j <Ans.length(); j++) 
            {
                char Answ = Ans.charAt(j);
                if (Answ == 'X') 
                {
                    continue; 
                }
                char CAnsw = CAns.charAt(j);
                if (Answ == CAnsw) 
                {
                    marks += 1;
                } 
                else 
                {
                    marks -= 0.25;
                }
            }
            System.out.print(marks + " ");
        }
    }
}
