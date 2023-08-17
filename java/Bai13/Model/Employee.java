package Bai13.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    protected int employeeType;
    private static int employeeCount = 0;
    private List<Certificate> certificates;
    public Employee(String id, String fullName, String birthDay, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.certificates = new ArrayList<>();
        employeeCount++;
    }

    public abstract void showInformation();
}
