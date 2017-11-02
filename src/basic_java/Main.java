package basic_java;

public class Main
{
    public static void main(String args[])
    {
        Person m = new Person(27, 3039, "Michael");
        Person s = new Person(27, 2011, "Sapir");


        m.giveWallet(new Wallet());

        m.chackWallet().setCapacity(100);
        m.chackWallet().fillMoney(20.5);

        System.out.println(m);
        System.out.println(s);




    }
}
