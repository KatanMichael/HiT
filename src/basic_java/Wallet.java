package basic_java;

public class Wallet {

    private int capacity;
    private double currentMoney;
    private String color;

    public Wallet(int capacity, double currentMoney, String color) {
        this.capacity = capacity;
        this.currentMoney = currentMoney;
        this.color = color;

    }

    public Wallet(int capacity) {
        this(capacity, 0, "black");

    }

    public Wallet(Wallet other) {
        this(other.capacity, other.currentMoney, other.color);
    }

    public Wallet() {
        this(0, 0, "Black");
    }


    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0)
            this.capacity = capacity;
    }

    public double getCurrentMoney() {
        return this.currentMoney;

    }

    public void setCurrentMoney(double currentMoney) {
        if (currentMoney > 0 && currentMoney < capacity)
            this.currentMoney = currentMoney;
    }

    public String getColor() {
        return this.color;
    }

    public void empty() {
        this.currentMoney = 0;
    }

    public boolean isEmpty() {
        return this.currentMoney == 0;
    }

    public void fillMoney(double amout) {
        if (this.capacity < amout + this.currentMoney)
            this.currentMoney = this.capacity;
        else
            this.currentMoney += amout;

    }

    public void transferMoney(Wallet other) {
        double freeSpace = other.capacity - other.currentMoney;
        if (other.capacity > this.currentMoney) {
            other.fillMoney(this.currentMoney);
            this.currentMoney = 0;
        } else {
            other.fillMoney(freeSpace);
            this.currentMoney -= freeSpace;
        }

    }


    public void print() {
        System.out.println("this is a wallter that can hold " + "up " + this.capacity

        );

    }

}