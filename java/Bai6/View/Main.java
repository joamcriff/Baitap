package Bai6.View;

import Bai6.Controller.Controller;
import Bai6.Model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller aClass = new Controller();
        while(true) {
            System.out.println("Choose 1: To add student");
            System.out.println("Choose 2: To show information age up to 20");
            System.out.println("Choose 3: To show information age 23 and hometown DN");
            System.out.println("Choose 4: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Enter class");
                    String classname = scanner.next();
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter age");
                    int age = scanner.nextInt();
                    System.out.println("Enter Home Town");
                    String homeTown = scanner.next();
                    Student student = new Student(classname,name, age, homeTown);
                    aClass.addStudent(student);
                    break;
                }
                case 2: {
                    aClass.showUpTo20();
                    break;
                }
                case 3: {
                    aClass.showStudent();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
