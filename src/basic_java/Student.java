package basic_java;

public class Student extends Person {
    private int numOfCurses;

    public Student() {

    }

    public Student(int numOfCurses, int id, int age, String name) {
        super(age, id, name);
        this.numOfCurses = numOfCurses;
    }

    public int getNumOfCurses() {
        return numOfCurses;
    }

    public void setNumOfCurses(int numOfCurses) {
        this.numOfCurses = numOfCurses;
    }

    public String toString() {
        if (this.chackWallet() != null) {
            return ("My Name is: " + this.getName()
                    + ", I'm " + this.getAge() + " Years old.\nMy ID number is: " + this.getId() +
                    ", And I got " + chackWallet().getCurrentMoney() + " Money In My Wallet, \n " +
                    "Im A student and i got " + this.getNumOfCurses() + " Curses");
        } else {
            return ("My Name is: " + this.getName()
                    + ", I'm " + this.getAge() + " Years old.\nMy ID number is: " + this.getId() +
                    ", I dont have a wallet, \n " +
                    "Im A student and i got " + this.getNumOfCurses() + " Curses");
        }
    }

    public void print() {
        System.out.println("DAMMM Student!");
    }

}
