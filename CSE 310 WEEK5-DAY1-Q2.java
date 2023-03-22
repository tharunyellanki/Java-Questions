/* Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers.
Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. The program should print ascending 
order on entering 1 and descending order on entering 2. If duplicate elements exist in an array then it should only print once in the output. */

// code for Q2
import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<5||n>15)
        {
               System.out.println("Invalid");
        }
        else
        {
        int[] arr =new int[n];
       
        for (int i=0;i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        int choice = sc.nextInt();
        if (choice == 1) 
        {
            Arrays.sort(arr);
            
            for (int i=0;i<n;i++) 
            {
                if (i ==0||arr[i]!= arr[i - 1]) 
                {
                    System.out.print(arr[i] + " ");
                }
            }
        } 
            else if (choice == 2) 
        {
            Arrays.sort(arr);
           
            for (int i=n-1;i>=0;i--) {
                if (i== n-1||arr[i]!=arr[i+1]) 
                {
                    System.out.print(arr[i] + " ");
                }
            }
         } 
        }
    }
}
