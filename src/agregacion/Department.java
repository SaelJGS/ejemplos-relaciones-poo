package agregacion;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private final List<Student> students;

    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = new ArrayList<>(students);
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getStudentCount() {
        return students.size();
    }
}
