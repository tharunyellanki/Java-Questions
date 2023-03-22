/* Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win 
the game. */ 


import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) 
            {
                game[i] = sc.nextInt();
            }
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
    }

    public static boolean canWin(int leap, int[] game) 
    {
        int n = game.length;
        boolean[] visited = new boolean[n];
        return explore(game, 0, leap, visited);
    }

    public static boolean explore(int[] game, int pos, int leap, boolean[] visited) 
    {
        if (pos < 0 || game[pos] == 1 || visited[pos]) 
        {
            return false;
        }
        if (pos + leap >= game.length || pos == game.length - 1) 
        {
            return true;
        }
        visited[pos] = true;
        return explore(game, pos + 1, leap, visited) || 
               explore(game, pos - 1, leap, visited) ||
               explore(game, pos + leap, leap, visited);
    }
}
