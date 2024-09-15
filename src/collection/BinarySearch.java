package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(150);
        list.add(-30);
        list.add(19);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
//        int index = Collections.binarySearch(list, 12);
//        System.out.println(index);

//        Employee emp1 = new Employee(100, "Zaur", 12345);
//        Employee emp2 = new Employee(15, "Alex", 123);
//        Employee emp3 = new Employee(123, "Andrii", 12342145);
//        Employee emp4 = new Employee(42, "Ivan", 42123);
//        Employee emp5 = new Employee(15, "Stella", 6216);
//        Employee emp6 = new Employee(250, "Bella", 2561);
//        Employee emp7 = new Employee(15, "Luka", 89123);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        System.out.println(employeeList);
//
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//
//        int index = Collections.binarySearch(employeeList, new Employee(123, "Andrii", 12342145));
//        System.out.println(index);
//
//        int[] array = {-38, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index = Arrays.binarySearch(array, 150);
//        System.out.println(index);
    }

    class Employee implements Comparable<Employee> {
        int id;
        String name;
        int salary;

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
        }

        @Override
        public int compareTo(Employee anotherEmp) {
            int result = this.id - anotherEmp.id;
            if (result == 0) {
                result = this.name.compareTo(anotherEmp.name);
            }
            return result;
        }
    }
}
