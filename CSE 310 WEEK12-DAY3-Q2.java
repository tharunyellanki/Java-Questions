/* Create a functional interface Predicate with an abstract method test with following signature: boolean test(String t); Write a test program to filter all the strings
present in group of strings which ended with character ‘g’ by using above test method with the help of lambda expression. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=1) 
        {
            System.out.println("Invalid");
            return;
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            String s = sc.next();
            strings.add(s);
        }
        Predicate<String> endsWithG = (s) -> s.endsWith("g");
        List<String> filteredStrings = filterStrings(strings, endsWithG);
        for (String s : filteredStrings) 
        {
            System.out.println(s);
        }
    }
    private static List<String> filterStrings(List<String> strings, Predicate<String> predicate) 
    {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) 
        {
            if (predicate.test(s)) 
            {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}
