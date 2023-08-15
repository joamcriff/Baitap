package Bai6.Controller;

import Bai6.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Student> students;
    public Controller() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void showUpTo20() {
        for(Student student1 : this.students) {
            if(student1.getAge() > 20) {
                System.out.println(student1.toString());
            }
        }
    }
    public void showStudent() {
        for (Student student1 : this.students) {
            if(student1.getAge()==23 && student1.getHomeTown().equals("DN")) {
                System.out.println(student1.toString());
            }
        }
    }
}
