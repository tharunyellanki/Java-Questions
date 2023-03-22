/* Puneet and Virat are playing a game. Virat tells a number that Puneet need to check whether that number is even and multiple of 3 or not. Write a program in which 
implement a method public boolean check(int n) which will return true if number satisfy the conditions else return false. */ 

//code for Q2

import java.util.Scanner;

public class Game 
{
    public boolean check(int x)
    {
        if(x%2 == 0 && x%3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Game a=new Game();
        if(x<20 || x>400)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(a.check(x))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}
