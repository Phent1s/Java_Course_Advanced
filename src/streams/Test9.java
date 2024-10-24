package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Andrii", 'm', 18, 2, 7.5);
        Student st3 = new Student("Stella", 'f', 18, 2, 9.5);
        Student st4 = new Student("Bella", 'f', 20, 3, 9.3);
        Student st5 = new Student("Vlad", 'm', 19, 4, 6.3);

        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


//        List<Integer> courses = students.stream()
//                .mapToInt(el -> el.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(courses);

        int sum = students.stream().mapToInt(el->el.getCourse()).sum();
        System.out.println(sum);


        double avg = students.stream().mapToInt(el->el.getCourse())
                .average().getAsDouble();
        System.out.println(avg);

        int min = students.stream().mapToInt(el->el.getCourse())
                .min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(el->el.getCourse())
                .max().getAsInt();
        System.out.println(max);

//        Student min = students.stream().min(
//                (x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//        Student max = students.stream().max(
//                (x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 18).forEach(e -> System.out.println(e));
//        System.out.println("--------------------------------------------------------------");
//        students.stream().filter(e -> e.getAge() > 18).limit(2)
//                .forEach(e -> System.out.println(e));
//        System.out.println("--------------------------------------------------------------");
//
//        students.stream().filter(e -> e.getAge() > 18).skip(2).limit(2)
//                .forEach(e -> System.out.println(e));
//        System.out.println("--------------------------------------------------------------");

    }
}
