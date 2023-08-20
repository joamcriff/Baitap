package Bai15.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department {
    private String nameDepartment;
    private List<InformationStudent> students;
    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        this.students = new ArrayList<>();
    }

    public void addStudent(InformationStudent student) {
        students.add(student);
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public List<InformationStudent> getStudents() {
        return students;
    }

    public void setStudents(List<InformationStudent> students) {
        this.students = students;
    }


}
