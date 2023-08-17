package Bai14.View;

import Bai13.View.View;
import Bai14.Controller.TuyenSinhControl;
import Bai14.Controller.Validator;
import Bai14.Exception.FullNameException;
import Bai14.Exception.InvalidDOBEException;
import Bai14.Exception.InvalidPhoneNumberException;
import Bai14.Model.GoodStudent;
import Bai14.Model.NormalStudent;

import java.util.Scanner;

public class Main {
    enum Student {
        GoodStudent,
        NormalStudent,
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinhControl tuyenSinh = new TuyenSinhControl();
        while (true) {
            System.out.println("Choose 1: To add");
            System.out.println("Choose 2: To selectCandidates");
            System.out.println("Choose 3: To displayAllStudentsInfo");
            System.out.println("Choose 4: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    Student student = null;
                    System.out.println("Choose 1: To add Good Student");
                    System.out.println("Choose 2: To add Normal Student");
                    int a = scanner.nextInt();
                    switch (a) {
                        case 1: {
                            student = student.GoodStudent;
                            break;
                        }
                        case 2: {
                            student = student.NormalStudent;
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    System.out.print("Enter FullName:");
                    String fullName = scanner.next();
                    try {
                        Validator.validateFullName(fullName);
                    } catch (FullNameException e) {
                        System.out.println("Invalid Full Name format: " + e.getMessage());
                        return;
                    }
                    System.out.print("Enter birthDay: ");
                    String birthDay = scanner.next();
                    try {
                        Validator.validateDateOfBirth(birthDay);
                    } catch (InvalidDOBEException e) {
                        System.out.println("Invalid date of birth format: " + e.getMessage());
                        return;
                    }
                    System.out.print("Enter Sex: ");
                    String sex = scanner.next();
                    System.out.print("Enter phone: ");
                    String phone = scanner.next();
                    try {
                        Validator.validatePhone(phone);
                    } catch (InvalidPhoneNumberException e) {
                        System.out.println("Invalid phone format: " + e.getMessage());
                        return;
                    }
                    System.out.print("Enter universityName: ");
                    String universityName = scanner.next();
                    System.out.print("Enter gradeLevel: ");
                    String gradeLevel = scanner.next();

                    switch (student) {
                        case GoodStudent: {
                            System.out.print("Enter gpa: ");
                            int gpa = scanner.nextInt();
                            System.out.print("Enter bestRewardName: ");
                            String bestRewardName = scanner.next();
                            GoodStudent g = new GoodStudent(fullName, birthDay, sex, phone, universityName, gradeLevel, gpa, bestRewardName);
                            tuyenSinh.add(g);
                            break;
                        }
                        case NormalStudent: {
                            System.out.print("Enter englishScore: ");
                            int englishScore = scanner.nextInt();
                            System.out.print("Enter entryTestScore: ");
                            int entryTestScore = scanner.nextInt();
                            NormalStudent n = new NormalStudent(fullName, birthDay, sex, phone, universityName, gradeLevel, englishScore, entryTestScore);
                            tuyenSinh.add(n);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    tuyenSinh.selectCandidates();
                    break;
            }
                case 3: {
                    tuyenSinh.displayAllStudentsInfo();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}
