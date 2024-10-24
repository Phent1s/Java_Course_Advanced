package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

//       Map<Integer, List<Student>> map = students.stream().map(elem -> {
//                    elem.setName(elem.getName().toUpperCase());
//                    return elem;
//                })
//                .collect(Collectors.groupingBy(el -> el.getCourse()));
//
//       for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//           System.out.println(entry.getKey()+ ": " + entry.getValue().toString());
//       }

        Map<Boolean, List<Student>> map =
                students.stream().map(elem -> {
                    elem.setName(elem.getName().toUpperCase());
                    return elem;
                })
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade()>8));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ ": " + entry.getValue().toString());
        }
    }
}
