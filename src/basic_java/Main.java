package basic_java;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int x = 0, y = 0, z = 0;

        Scanner scan = new Scanner(System.in);

        Person M = new Person(scan.nextInt(), scan.nextInt(), scan.next());

        System.out.println(M);

    }
}
