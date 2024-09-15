package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 19, 'm', 2, 93.3);
        Student st2 = new Student("Alex", 19, 'm', 3, 98.3);
        Student st3 = new Student("Andrii", 20, 'm', 2, 92.3);
        Student st4 = new Student("Stella", 19, 'f', 2, 94.3);
        Student st5 = new Student("Bella", 18, 'f', 3, 91.3);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        Student st6 = new Student("Bella", 18, 'f', 3, 91.3);
//        students.remove(st6);
//        System.out.println(students);

        System.out.println(students.contains(st6));

        int index = students.indexOf(st6);
        System.out.println(index);
    }
}

class Student{
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public Student(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }


}
