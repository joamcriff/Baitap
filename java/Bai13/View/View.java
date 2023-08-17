package Bai13.View;

import Bai13.Controller.ControlStaff;
import Bai13.Controller.Validator;
import Bai13.Exception.BirthDayException;
import Bai13.Exception.EmailException;
import Bai13.Exception.FullNameException;
import Bai13.Exception.PhoneException;
import Bai13.Model.Experience;
import Bai13.Model.Fresher;
import Bai13.Model.Intern;

import java.util.Scanner;

public class View {
    enum Staff{
        Experience,
        Fresher,
        Intern
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlStaff ct = new ControlStaff();
        while (true){
            System.out.println("Choose 1: To add");
            System.out.println("Choose 2: To modify");
            System.out.println("Choose 3: To remove");
            System.out.println("Choose 4: To search Experience");
            System.out.println("Choose 5: To search Fresher");
            System.out.println("Choose 6: To search Intern");
            System.out.println("Choose 7: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    Staff staff = null;
                    System.out.println("Choose 1: To add Experience");
                    System.out.println("Choose 2: To add Fresher");
                    System.out.println("Choose 3: To add Intern");
                    int a = scanner.nextInt();
                    switch (a) {
                        case 1: {
                            staff = staff.Experience;
                            break;
                        }
                        case 2: {
                            staff = staff.Fresher;
                            break;
                        }
                        case 3: {
                            staff = staff.Intern;
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    System.out.print("Enter Id: ");
                    String id = scanner.next();
                    System.out.print("Enter Full Name:");
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
                    } catch (BirthDayException e) {
                        System.out.println("Invalid date of birth format: " + e.getMessage());
                        return;
                    }
                    System.out.print("Enter phone: ");
                    String phone = scanner.next();
                    try {
                        Validator.validatePhoneNumber(phone);
                    } catch (PhoneException e) {
                        System.out.println("Invalid phone format: " + e.getMessage());
                        return;
                    }
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    try {
                        Validator.validateEmail(email);
                    } catch (EmailException e) {
                        System.out.println("Invalid email format: " + e.getMessage());
                        return;
                    }
                    switch (staff) {
                        case Experience: {
                            System.out.print("Enter ExpInYear: ");
                            int ExpInYear = scanner.nextInt();
                            System.out.print("Enter ProSkill: ");
                            String ProSkill = scanner.next();
                            Experience experience = new Experience(id, fullName,birthDay, phone, email, ExpInYear, ProSkill);
                            ct.add(experience);
                            break;
                        }
                        case Intern: {
                            System.out.print("Enter Majors: ");
                            String Majors = scanner.next();
                            System.out.print("Enter Semester: ");
                            int Semester = scanner.nextInt();
                            System.out.print("Enter University Name: ");
                            String name = scanner.next();
                            Intern intern = new Intern(id, fullName,birthDay, phone, email, Majors, Semester, name);
                            ct.add(intern);
                            break;
                        }
                        case Fresher: {
                            System.out.print("Enter Graduation_date: ");
                            int date = scanner.nextInt();
                            System.out.print("Enter Graduation_rank: ");
                            String rank = scanner.next();
                            System.out.print("Enter Education: ");
                            String edu = scanner.next();
                            Fresher fresher = new Fresher(id, fullName,birthDay, phone, email, date, rank, edu);
                            ct.add(fresher);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter id");
                    String id = scanner.next();
                    ct.modify(id);
                    break;
                }
                case 3: {
                    System.out.println("Enter id");
                    String id = scanner.next();
                    ct.removeStaff(id);
                    break;
                }
                case 4: {
                    ct.findExperience();
                    break;
                }
                case 5: {
                    ct.findFresher();
                    break;
                }
                case 6: {
                    ct.findIntern();
                    break;
                }
                case 7: {
                    System.exit(0);
                }
            }
        }
    }
}
