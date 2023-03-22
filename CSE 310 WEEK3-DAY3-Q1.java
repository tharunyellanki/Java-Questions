/* Sameer wants to develop a program for ATM. Help him by constructing the program for the same. In the program if user withdraws amount upto 1000 then machine will 
dispence Rs. 100 notes only. Minimum number of notes should be dispenced by the machine. Notes of denomination of 100,200,500 and 2000 are available in machine. */

//code for Q1

import java.util.Scanner;

class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        
        if(x<100||x>20000||x%100!=0)
        {
            System.out.println("Invalid Input");
            return;
        }
        int[] notes={2000,500,200,100};
        int[] notesCount=new int[4];
        for (int i = 0; i < 4; i++) 
        {
            if(x>=notes[i])
            {
                notesCount[i]=x/notes[i];
                x=x%notes[i];
            }
        }
        for (int i = 0; i < 4; i++) {
      if (notesCount[i] != 0) {
        System.out.println(notesCount[4-i] + " " + notes[4-i] + " Notes");
      }
    }
  }
}
        
