/* You need to create an application for a company, who is planning to maintain passwords of his employees, so to manage passwords company officials are thinking about 
of python case format. In Python case format, particular String is concerted into complete lower case and space is replaced by special character “$”. In this format , 
password which is taken as string that must consist with more than 1 word. */

//code for Q1
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
         if(password.length()<=1)
        {
            System.out.println("Wrong Input");
            return;
        }

        String pythonCase = password.toLowerCase().replace(" ", "$");
        System.out.println(pythonCase);
    }
}
