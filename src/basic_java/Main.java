package basic_java;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int x = 0, y = 0, z = 0;

        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        System.out.println();

        System.out.println("You entered: " + x + " " + y + " " + "And " + z);

    }
}
