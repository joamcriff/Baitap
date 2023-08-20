package Bai15.View;

import Bai14.Controller.Validator;
import Bai14.Exception.FullNameException;
import Bai14.Exception.InvalidDOBEException;
import Bai15.Model.*;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class View {
    private Scanner scanner = new Scanner(System.in);
    public enum StudentType {
        FullTimeStudent,
        InserviceStudent
    }

    public void displayMainMenu() {
        System.out.println("Choose 1: Add Student");
        System.out.println("Choose 2: Check isRegular");
        System.out.println("Choose 3: Search averagePoint");
        System.out.println("Choose 4: Show Total Student Regular");
        System.out.println("Choose 5: Exit");
    }

    public InformationStudent inputStudent() {
        StudentType type = selectStudentType();
        if (type == null) {
            System.out.println("Invalid student type.");
            return null;
        }

        String id = inputId();
        String name = inputName();
        try {
            Validator.validateFullName(name);
        } catch (FullNameException e) {
            System.out.println("Invalid Full Name format: " + e.getMessage());
        }
        String dOB = inputDOB();
        try {
            Validator.validateDateOfBirth(dOB);
        } catch (InvalidDOBEException e) {
            System.out.println("Invalid date of birth format: " + e.getMessage());
        }
        int year = inputYear();
        int entryPoint = inputEntryPoint();
        String department = department();
        Set<ListOutcome> inputOutcome = inputOutcome();

        switch (type) {
            case FullTimeStudent:
                return new FullTimeStudent(id, name, dOB, year, entryPoint,department ,inputOutcome);
            case InserviceStudent:
                String trainingLocation = trainingLocation();
                return new InserviceStudent(id, name, dOB, year, entryPoint,department ,inputOutcome ,trainingLocation);
            default:
                return null;
        }
    }

    private StudentType selectStudentType() {
        System.out.println("Choose student type:");
        System.out.println("1: FullTimeStudent");
        System.out.println("2: InserviceStudent");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return StudentType.FullTimeStudent;
            case 2:
                return StudentType.InserviceStudent;
            default:
                return null;
        }
    }

    public String department() {
        System.out.print("Enter Department: ");
        return scanner.next();
    }
    public String inputId() {
        System.out.print("Enter ID: ");
        return scanner.next();
    }

    public String inputName() {
        System.out.print("Enter Name: ");
        return scanner.next();
    }

    public String inputDOB() {
        System.out.print("Enter Day of Birth: ");
        return scanner.next();
    }

    public int inputYear() {
        System.out.print("Enter Year: ");
        return scanner.nextInt();
    }

    public int inputEntryPoint() {
        System.out.print("Enter Entry Point: ");
        return scanner.nextInt();
    }

    public Set<ListOutcome> inputOutcome() {
        Set<ListOutcome> outcomes = new HashSet<>();
        while(true){
            System.out.print("Enter Semester Name: ");
            String semesterName = scanner.next();
            if (semesterName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter Average Score: ");
            double averageScore = scanner.nextDouble();
            ListOutcome outcome = new ListOutcome(semesterName, averageScore);
            outcomes.add(outcome);
        }
        return outcomes;
    }

    private String trainingLocation() {
        System.out.print("Enter TrainingLocation: ");
        return scanner.next();
    }

    public void showTotal(int a) {
        System.out.println("Total student: " + a);
    }
}
