/* Create a class Integer1 with an attribute of int type array and 2 methods named sum (calculate and returned the sum of array) and multiplication (calculate and 
returned the multiplication of array). Write a program to take the input of int array for Integer1 class. Give choice to user to display the sum or multiplication of 
array by using the above mentioned methods. User will only has 2 choices to calculate the sum or multiplication. If user will entered any other choice then display the 
message “Wrong Choice”. */

//code for Q1

import java.util.Scanner;

public class Int1
{
    int[] arr;
    
    public Int1(int[] arr)
    {
        this.arr=arr;
    }
    
    public int sum()
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public int mul()
    {
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            mul=mul*arr[i];
        }
        return mul;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        if(r<=0)
        {
            System.out.println("Invalid");
        }
        else
        {
            int[] arr=new int[r];
            for(int i=0;i<r;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            Int1 a=new Int1(arr);
            
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println(a.sum());
            }
            else if(choice==2)
            {
                System.out.println(a.mul());
            }
            else
            {
                System.out.println("Wrong Choice");
            }
        }
    } 
}
