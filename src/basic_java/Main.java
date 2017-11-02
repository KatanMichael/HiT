package basic_java;

public class Main
{
    public static void main(String args[])
    {
        Student m = new Student(6, 3049, 27, "Michael");
        Person s = new Person(27, 2011, "Sapir");

        Person e = new Student(6, 1234, 24, "Eddie");



        m.giveWallet(new Wallet());

        m.chackWallet().setCapacity(100);
        m.chackWallet().fillMoney(20.5);

        System.out.println(m);
        System.out.println(s);
        System.out.println(e);




    }
}
