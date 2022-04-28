package wordpyramid;

import java.util.Scanner;

public class WordPyramid {

    public static void Pyramid(String in)
    {
        if (in.length() <= 1) System.out.println(in);
        else
        {
            System.out.println(in);
            Pyramid(in.substring(1, in.length() - 1));
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String in;

        System.out.println("Enter your word:");
        in = input.nextLine();

        System.out.println();
        Pyramid(in);
    }
}
