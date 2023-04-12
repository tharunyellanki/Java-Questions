/* Jatinder is having business of pharmaceuticals, in past few days he collected stock of 3 types of medicines but he is not able to arrange them properly. So your task
is to help him, by sorting medicine in alphabetical order using lambda expression. After arranging show all the medicine in alphabetical order at last. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> medicines = new ArrayList<>();
        
        for (int i=0;i<3;i++) 
        {
            String medicine = sc.nextLine();
            medicines.add(medicine);
        }
    
        Collections.sort(medicines, (m1,m2) -> m1.compareToIgnoreCase(m2));
          
        for (String medicine : medicines) 
        {
            System.out.println(medicine);
        }
    }
}
