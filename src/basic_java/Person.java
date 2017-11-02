package basic_java;


public class Person
{
    private static int x = 0;
    private int age;
    private int id;
    private String name;
    private Wallet myWallet;


    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, int id, String name)
    {
        this.age = age;
        this.name = name;
        this.id = id;
        this.x++;
    }

    public Person()
    {
        this(0, 0, "Unknown");
    }

    public Person(int age) {
        this(age, 0, "Unknown");
    }


    public String toString ()
    {
        if (this.chackWallet() != null) {
            return ("My Name is: " + this.name
                    + ", I'm " + this.age + " Years old.\nMy ID number is: " + this.id +
                    ", And I got " + chackWallet().getCurrentMoney() + " Money In My Wallet");
        } else {
            return ("My Name is: " + this.name
                    + ", I'm " + this.age + " Years old.\nMy ID number is: " + this.id +
                    ",And i dont have a wallet");
        }
    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public void giveWallet(Wallet wallat) {
        this.myWallet = new Wallet(wallat);
    }

    public Wallet chackWallet() {
        return (this.myWallet);
    }


}
