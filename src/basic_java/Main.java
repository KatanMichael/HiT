package basic_java;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int x = 0, y = 0, z = 0;

        Scanner scan = new Scanner(System.in);

        Integer b = new Integer(10);
        Integer a = new Integer(20);

        System.out.println("A is: "+a.intValue() + " And B is:" +b.intValue());

        swap(a,b);

        System.out.println("A is: "+a.intValue() + " And B is:" +b.intValue());

    }

    public static void swap(Integer a, Integer b)
    {
        Integer temp;
        temp = a;
        a = b;
        b = temp;

    }
}
