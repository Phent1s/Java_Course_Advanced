package streams;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Andrii", 'm', 18, 2, 7.5);
        Student st3 = new Student("Stella", 'f', 18, 2, 9.5);
        Student st4 = new Student("Bella", 'f', 20, 3, 9.3);
        Student st5 = new Student("Vlad", 'm', 19, 4, 6.3);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");
        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st2);
        f1.addStudentOnFaculty(st3);
        f2.addStudentOnFaculty(st4);
        f2.addStudentOnFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty()
                        .stream())
                .forEach(e->System.out.println(e.getName()));

        facultyList.stream().map(fac->fac.studentsOnFaculty)
                .forEach(System.out::println);
    }
}


class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentOnFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}