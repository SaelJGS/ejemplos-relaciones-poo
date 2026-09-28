package agregacion;

import java.util.Arrays;

public class AggregationExample {
    public static void main(String[] args) {
        // Los estudiantes existen antes de pertenecer a un departamento.
        Student parul = new Student("Parul", 1);
        Student sachin = new Student("Sachin", 2);
        Student priya = new Student("Priya", 3);
        Student rahul = new Student("Rahul", 4);

        Department cse = new Department("CSE", Arrays.asList(parul, sachin));
        Department ee = new Department("EE", Arrays.asList(priya, rahul));
        Institute institute = new Institute("BITS", Arrays.asList(cse, ee));

        System.out.println("Instituto: " + institute.getName());
        System.out.println("Estudiantes en " + cse.getName() + ": " + cse.getStudentCount());
        System.out.println("Estudiantes en " + ee.getName() + ": " + ee.getStudentCount());
        System.out.println("Total de estudiantes: " + institute.getTotalStudents());
        System.out.println("Estudiante independiente: " + parul.getName());
    }
}
