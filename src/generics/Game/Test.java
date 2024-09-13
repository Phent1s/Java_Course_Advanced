package generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 15);
        Schoolar schoolar2 = new Schoolar("Andrii", 16);
        Schoolar schoolar3 = new Schoolar("Maria", 14);
        Schoolar schoolar4 = new Schoolar("Sergei", 12);

        Student student1 = new Student("Loka", 19);
        Student student2 = new Student("Alexandr", 20);

        Employee employee1 = new Employee("Kika", 26);
        Employee employee2 = new Employee("Loh", 29);

        Team<Schoolar> schoolarTeam = new Team<>("SchoolarTeam");
        Team<Schoolar> schoolarTeam2 = new Team<>("SchoolarTeam2");
        Team<Student> studentTeam = new Team<>("StudentTeam");
        Team<Employee> employeeTeam = new Team<>("EmployeeTeam");
        schoolarTeam.addParticipant(schoolar1);
        schoolarTeam.addParticipant(schoolar2);
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

        schoolarTeam2.addParticipant(schoolar3);
        schoolarTeam2.addParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);


    }
}
