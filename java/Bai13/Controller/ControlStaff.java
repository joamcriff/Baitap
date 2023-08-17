package Bai13.Controller;

import Bai13.Exception.BirthDayException;
import Bai13.Exception.EmailException;
import Bai13.Exception.FullNameException;
import Bai13.Exception.PhoneException;
import Bai13.Model.Employee;
import Bai13.Model.Experience;
import Bai13.Model.Fresher;
import Bai13.Model.Intern;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class ControlStaff {
    private Set<Employee> employees;
    Scanner scanner = new Scanner(System.in);
    public ControlStaff() {
        this.employees = new HashSet<>();
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void modify(String id) {
        Optional<Employee> employeeOptional = this.employees.stream().filter(i->i.getId().equals(id)).findFirst();

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            System.out.println("Document exist");
            System.out.println("Do you want fix document");
            System.out.println("Choose 1: OK");
            System.out.println("Choose 2: Deny");
            int a = scanner.nextInt();
            switch (a) {
                case 1: {
                    System.out.println("Enter id");
                    String ID = scanner.next();
                    employee.setId(ID);

                    System.out.println("Enter FullName");
                    String fullName = scanner.next();
                    try {
                        Validator.validateFullName(fullName);
                        employee.setFullName(fullName);
                    } catch (FullNameException e) {
                        System.out.println("Invalid Full Name format: " + e.getMessage());
                        return;
                    }

                    System.out.println("Enter Birthday");
                    String birthDay = scanner.next();
                    try {
                        Validator.validateDateOfBirth(birthDay);
                        employee.setBirthDay(birthDay);
                    } catch (BirthDayException e) {
                        System.out.println("Invalid date of birth format: " + e.getMessage());
                        return;
                    }

                    System.out.println("Enter Phone");
                    String phone = scanner.next();
                    try {
                        Validator.validatePhoneNumber(phone);
                        employee.setPhone(phone);
                    } catch (PhoneException e) {
                        System.out.println("Invalid phone format: " + e.getMessage());
                        return;
                    }

                    System.out.println("Enter Email");
                    String email = scanner.next();
                    try {
                        Validator.validateEmail(email);
                        employee.setEmail(email);
                    } catch (EmailException e) {
                        System.out.println("Invalid email format: " + e.getMessage());
                        return;
                    }
                    if (employee instanceof Experience) {
                        Experience experience = (Experience) employee;
                        System.out.println("Enter new ExpInYear:");
                        int newExpInYear = scanner.nextInt();
                        experience.setExpInYear(newExpInYear);

                        System.out.println("Enter new ProSkill:");
                        String newProSkill = scanner.next();
                        experience.setProSkill(newProSkill);
                    } else if (employee instanceof Fresher) {
                        Fresher fresher = (Fresher) employee;
                        System.out.println("Enter new GraduationDate:");
                        int newGraduationDate = scanner.nextInt();
                        fresher.setGraduation_date(newGraduationDate);

                        System.out.println("Enter new GraduationRank:");
                        String newGraduationRank = scanner.next();
                        fresher.setGraduation_rank(newGraduationRank);

                        System.out.println("Enter new Education:");
                        String newEducation = scanner.next();
                        fresher.setEducation(newEducation);
                    } else if (employee instanceof Intern) {
                        Intern intern = (Intern) employee;
                        System.out.println("Enter new Majors:");
                        String newMajors = scanner.next();
                        intern.setMajors(newMajors);

                        System.out.println("Enter new Semester:");
                        int newSemester = scanner.nextInt();
                        intern.setSemester(newSemester);

                        System.out.println("Enter new UniversityName:");
                        String newUniversityName = scanner.next();
                        intern.setUniversity_name(newUniversityName);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Update denied.");
                    break;
                }
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

    }
    public void removeStaff(String id) {
        this.employees.removeIf(i->i.getId().equals(id));
    }
    public void findIntern() {
        this.employees.stream().filter(i-> i instanceof Intern).forEach(i -> System.out.println(i));
    }
    public void findFresher() {
        this.employees.stream().filter(i-> i instanceof Fresher).forEach(i -> System.out.println(i));
    }
    public void findExperience() {
        this.employees.stream().filter(i-> i instanceof Experience).forEach(i -> System.out.println(i));
    }
}
