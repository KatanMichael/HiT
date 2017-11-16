package basic_java;

import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
    public static void main(String args[])
    {
        Student[] school = new Student[3];
        school[0] = new Student(7, 2, 5, "Michael");
        school[1] = new Student(1, 8, 8, "Max");
        school[2] = new Student(18, 3, 1, "Eddie");

        ArrayList<Student> schoolList = new ArrayList<>();

        for (Student s : school) {
            schoolList.add(s);
        }

        schoolList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                return 0;
            }
        });

        for (Student s : school) {
            System.out.println(s);
        }

    }

}
