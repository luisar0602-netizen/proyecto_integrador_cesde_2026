package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Persons;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

public class Main {
    public static void main (String[] args ) {
        System.out.println("hello World!");
        Persons persons = new Persons();
        Persons persons2 = new Persons();

        persons.setFirstName("John");
        persons.getFirstName();
        persons.setFirstName("Juan");
        persons.getFirstName();

        Persons persons4 = new Persons(1L, "31","1036657406","Luisa","Rodriguez",true);

        System.out.println(persons.toString());

        Student student = new Student(2L, "10", "1017520609", "Maria", "Salazar", true);
        student.setFirstName("Mery");
        student.setBirthDate("1974-09-30");
        System.out.println(student.toString());

        Teacher teacher = new Teacher();
        teacher.setFirstName("Rosa");
        System.out.println(teacher.toString());

        Student student1= new Student(2L, "10","1017520609","Maria","Salazar",true);
        System.out.println(student1.toString());

        Teacher teacher1= new Teacher(3L,"11","43608749","Sara","Ramirez",true);
        System.out.println(teacher1.toString());
    }
}
