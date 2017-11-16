package collections;

public class Driver implements Comparable<Driver> {
    private String name;
    private int id;
    private int age;

    public Driver(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Driver o) {
        if (this.id > o.id) {
            return 1;
        }
        if (this.id < o.id) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        return id == driver.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
