/* Ask the user to enter an input of integer type, which represents the number of rows. If the value entered by him is greater than 0, then display the pattern of numbers
as explained in example below. Example: Pattern for rows to be displayed if user enters no. of rows as 5: 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1 */

//code for Q1

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int i;
        for(i=a+1;i>=0;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
