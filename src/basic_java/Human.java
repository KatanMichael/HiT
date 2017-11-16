package basic_java;

public abstract class Human implements Time {
    String name = "";
    int age = 0;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();

    public void agedUp() {
        this.age++;
    }


}
