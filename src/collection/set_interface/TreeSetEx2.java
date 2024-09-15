package collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student st1 = new Student("Naur", 4);
        Student st2 = new Student("Andrii", 6);
        Student st3 = new Student("Stella", 1);
        Student st4 = new Student("Bella", 3);
        Student st5 = new Student("Ivan", 2);
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        Student st6 = new Student("Oleg", 3);
        Student st7 = new Student("Okla", 4);
        System.out.println(ts.headSet(st6));
        System.out.println(ts.tailSet(st6));
        System.out.println(ts.subSet(st6, st7));
        System.out.println(st6.equals(st4));

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}