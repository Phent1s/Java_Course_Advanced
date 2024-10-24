package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if(s.avgGrade>grade){
//                System.out.println(s+" is over grade");
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if(s.age<age){
//                System.out.println(s+" is under age");
//            }
//        }
//    }
//    void printStudentMixedCond(ArrayList<Student> al,int age,char sex, double grade) {
//        for (Student s : al) {
//            if(s.age>age && s.avgGrade<grade && s.gender == sex){
//                System.out.println(s+" in mixed conditions");
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 18, 2, 92.3);
        Student st2 = new Student("Andrii", 'm', 19, 3, 94.0);
        Student st3 = new Student("Stella", 'f', 17, 2, 100.0);
        Student st4 = new Student("Bella", 'f', 20, 3, 95.2);
        Student st5 = new Student("Ilya", 'm', 17, 1, 94.9);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();

//        Collections.sort(students, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student st1, Student st2) {
//                return st1.course-st2.course;
//            }
//        });

        Collections.sort(students, (std1, std2) -> std1.course-std2.course);
//        info.testStudents(students, new CheckOverGrade());
//        info.testStudents(students, s -> s.age > 18);
//        info.testStudents(students, s -> s.avgGrade > 95);
//        info.testStudents(students, s -> s.age > 18 && s.avgGrade > 95);

//        StudentChecks sc = (Student s) -> {return s.avgGrade > 96;};

//        info.printStudentOverGrade(students,95.0);
//        info.printStudentUnderAge(students,19);
//        info.printStudentMixedCond(students,17, 'f', 100);

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgofSmth(students, student -> (double)student.age);
        System.out.println(res);


    }

    private static double avgofSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>=95.0;
//    }
//}