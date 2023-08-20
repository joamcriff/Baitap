package Bai15.Controller;

import Bai15.Model.FullTimeStudent;
import Bai15.Model.InformationStudent;
import Bai15.View.View;

import java.util.*;

public class ControlInfor {
    private List<InformationStudent> informationStudents;
    private View view;
    public ControlInfor(View view) {
        this.informationStudents = new ArrayList<>();
        this.view = view;
    }
    Scanner scanner = new Scanner(System.in);
    public void start() {
        while (true) {
            view.displayMainMenu();
            int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        checkRegularStudent(view.inputId());
                        break;
                    case 3:
                        showAverage(view.inputId());
                        break;
                    case 4:
                        view.showTotal(totalStudent());
                        break;
                    case 5:
                        System.out.println("Exiting the system.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
            }
        }
    }

    public void addStudent() {
        InformationStudent student = view.inputStudent();
        this.informationStudents.add(student);
    }
    public boolean isRegularStudent(InformationStudent informationStudent) {
        return informationStudent instanceof FullTimeStudent;
    }
    public void checkRegularStudent(String id) {
        Optional<InformationStudent> stu = this.informationStudents.stream().filter(i->i.getId().equals(id)).findFirst();
        if(stu.isEmpty()) {
            System.out.println("No student");
        }
        if(isRegularStudent(stu.get())){
            System.out.println("Student is Regular Student");
        } else {
            System.out.println("Student is not Regular Student");
        }
    }

    public String averagePoint(String id) {
        Optional<InformationStudent> stu = this.informationStudents.stream().filter(i->i.getId().equals(id)).findFirst();
        if(stu.isEmpty()) {
            System.out.println("No student");
        }
        return stu.get().getListOutcomes().toString();
    }

    public void showAverage(String id) {
        System.out.println(averagePoint(id));
    }

    public int totalStudent() {
       int a = this.informationStudents.stream().filter(i->i instanceof FullTimeStudent).toArray().length;
       return a;
    }

    public void checkUpPoint() {
        Map<String, InformationStudent> highestEntryByDepartment = new HashMap<>();

        for (InformationStudent student : this.informationStudents) {
            String studentDepartment = student.getDepartment();
            if (!highestEntryByDepartment.containsKey(studentDepartment) ||
                    student.getEntryPoint() > highestEntryByDepartment.get(studentDepartment).getEntryPoint()) {
                highestEntryByDepartment.put(studentDepartment, student);
            }
        }

        System.out.println("Sinh viên có điểm đầu vào cao nhất ở mỗi khoa:");
        for (Map.Entry<String, InformationStudent> entry : highestEntryByDepartment.entrySet()) {
            String departmentName = entry.getKey();
            InformationStudent studentWithHighestEntry = entry.getValue();
            System.out.println("Khoa: " + departmentName + ", Sinh viên: " + studentWithHighestEntry.getName() +
                    ", Điểm đầu vào: " + studentWithHighestEntry.getEntryPoint());
        }
    }
}
