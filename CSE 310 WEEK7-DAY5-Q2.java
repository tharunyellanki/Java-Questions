/* Aviraj and Viraj are playing a game. Viraj shared a statement with Aviraj. Viraj wants Avraj to tell word count having length N. Help Viraj by developing a program. */

//code for Q2

import java.util.Scanner;

class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine().trim();
        int N = Integer.parseInt(sc.nextLine().trim());

        if (N<1||N>10) 
        {
            System.out.println("Invalid Input");
        } 
        else 
        {
            String[] words = statement.split("\\s+");
            int count = 0;
            for (String word : words) 
            {
                if (word.length() == N) 
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
