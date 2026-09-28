package agregacion;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private final String name;
    private final List<Department> departments;

    public Institute(String name, List<Department> departments) {
        this.name = name;
        this.departments = new ArrayList<>(departments);
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public int getTotalStudents() {
        int total = 0;
        for (Department department : departments) {
            total += department.getStudentCount();
        }
        return total;
    }
}
