package basic_java;

public class Person
{
    int age;
    int id;
    String name;

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
    }

    public Person()
    {
        this.age = 0;
        this.id = 0;
        this.name = "Unknown";
    }


    public String toString ()
    {
        return ("My Name is: "+this.name
                +", I'm "+this.age +" Years old.\nMy ID number is: "+this.id);
    }
}
