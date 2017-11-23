package Exceptions;

public class ExMain {
    public static void main(String[] args) throws RuntimeException {
        try {
            int[] arr = {1, 2, 3, 4, 5, 56, 7, 7,};

            for (int i = 0; i < 100; i++) {


                System.out.println(arr[i]);
            }

            System.out.println("Im still running!");

        } catch (Exception e) {
            System.out.println("Great Succses!");
        }
    }

}
