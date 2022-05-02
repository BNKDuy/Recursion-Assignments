package recursionwordjumble;

import java.util.Scanner;

public class RecursionWordJumble 
{
    public static void jumble(String unUsed, String used)
    {
        String remaining;
        int position;

        if (unUsed.length() == 1) System.out.println(used + unUsed);
        else 
        {
            for (int i = 0; i < unUsed.length(); i++)
            {
                remaining = unUsed.substring(0, i) + unUsed.substring(i + 1, unUsed.length());           
                jumble(remaining, used + unUsed.substring(i, i + 1));
            }
        }
    }
    
    public static int factorial(int n)
    {
        if (n == 0) return 1;
        else return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        String in;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your word:");
        in = input.nextLine();
        System.out.println();

        jumble(in, "");

        System.out.print("\nThere are " + factorial(in.length()) + " ways to jumble!");
    }
    
}
