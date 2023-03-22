/* Write a program to convert the double type of array into int type array. If any value in the input array will be negative, display the message 
“Invalid Array Elements” otherwise display the elements of int type converted array. */

// code for Q1

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        double[] doubleArray = new double[size];
        for (int i = 0; i < size; i++) {
            doubleArray[i] = obj.nextDouble();
        }

        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (doubleArray[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            intArray[i] = (int) doubleArray[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(intArray[i]);
        }
    }
}
