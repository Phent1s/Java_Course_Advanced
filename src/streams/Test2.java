package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test2 {
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


//        students.stream().map(elem ->
//                {
//                    elem.getName().toUpperCase();
//                    return elem;
//                })
//                .filter(elem -> elem.getGender() == 'f')
//                .sorted((x, y) -> x.getAge() - y.getAge())
//                .forEach(elem -> System.out.println(elem));


        Student first = students.stream().map(elem ->
                {
                    elem.getName().toUpperCase();
                    return elem;
                })
                .filter(elem -> elem.getGender() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first.getName());


//        students = students.stream().sorted((x,y) ->
//                                             x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(students);

//        students = students.stream().filter(elem -> elem.getAge() > 19 && elem.getAvgGrade()<9.0).collect(Collectors.toList());
//        System.out.println(students);
//        Stream<Student> stream = Stream.of(st1,st2,st3,st4,st5);
//        stream.filter(elem -> elem.getAge() > 19 && elem.getAvgGrade()<9.0).collect(Collectors.toList());
//        System.out.println(students);
    }
}
