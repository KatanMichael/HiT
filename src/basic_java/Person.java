package basic_java;


public class Person extends Human
{
    private static int x = 0;
    int id;
    private String name;
    private Wallet myWallet;



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public Person(int age, int id, String name)
    {
        super(age, name);
        this.id = id;
        x++;
    }

    public Person()
    {
        super(0, "Unknon");
        this.id = 0;
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
        Person.x = x;
    }

    public void giveWallet(Wallet wallat) {
        this.myWallet = new Wallet(wallat);
    }

    public Wallet chackWallet() {
        return (this.myWallet);
    }

    public void print() {
        System.out.println("DAMM Person!");
    }

    public void ageDown() {
        this.age--;
    }

    public void printTime() {
        System.out.println("im just a person..");
    }

}
