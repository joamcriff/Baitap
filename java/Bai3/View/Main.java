package Bai3.View;

import Bai3.Controller.Controller;
import Bai3.Model.GroupA;
import Bai3.Model.GroupB;
import Bai3.Model.GroupC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller student = new Controller();
        enum Group {
            GroupA,
            GroupB,
            GroupC
        }
        while(true) {
            System.out.println("Choose 1: To add member");
            System.out.println("Choose 2: To show member");
            System.out.println("Choose 3: To search member");
            System.out.println("Choose 4: To exit ");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Choose 1: To add member Group A");
                    System.out.println("Choose 2: To add member Group B");
                    System.out.println("Choose 3: To add member Group C");
                    int a = scanner.nextInt();
                    Group group = null;
                    switch (a) {
                        case 1: {
                            group = group.GroupA;
                            break;
                        }
                        case 2: {
                            group = group.GroupB;
                            break;
                        }
                        case 3: {
                            group = group.GroupC;
                            break;
                        }

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    System.out.println("Enter ID: ");
                    String id = scanner.next();
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Address: ");
                    String address = scanner.next();
                    System.out.println("Enter Prioritize");
                    int pri = scanner.nextInt();
                    switch (group) {
                        case GroupA: {
                            GroupA memA = new GroupA(id, name, address, pri);
                            student.add(memA);
                            break;
                        }
                        case GroupB: {
                            GroupB memB = new GroupB(id, name, address, pri);
                            student.add(memB);
                            break;
                        }
                        case GroupC: {
                            GroupC memC = new GroupC(id, name, address, pri);
                            student.add(memC);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    student.show();
                    break;
                }
                case 3: {
                    System.out.println("Enter id to search");
                    String id = scanner.next();
                    student.search(id);
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
