/* Create a class Person having a single attribute: age. Now, create a functional interface with the following method in it: void find(Person p[]); Create a Demo class 
having main() method and ask the user to createa and initialize "n" Person objects (where "n" is input given by user). Now, use the lambda expression that will use this 
find() method to find out how many Persons have age greater than 25. */


import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>1)
        {
            int count = 0;
            int arr[] = new int[a];
            for (int i=0;i<a;i++)
            {
                arr[i] = sc.nextInt();
            }
             for (int i=0;i<a;i++)
            {
                 if (arr[i]>25)
                     count++;
            }
            System.out.println(count);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
