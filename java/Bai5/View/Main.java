package Bai5.View;


import Bai5.Controller.Controller;
import Bai5.Model.Hotel;
import Bai5.Model.People;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller hotel = new Controller();
        while (true) {
            System.out.println("Choose 1: To add new");
            System.out.println("Choose 2: To remove");
            System.out.println("Choose 3: To calculated");
            System.out.println("Choose 4: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Enter count");
                    int count = scanner.nextInt();
                    System.out.println("Enter Type");
                    String type = scanner.next();
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter age");
                    int age = scanner.nextInt();
                    System.out.println("Enter id");
                    String id = scanner.next();
                    People people = new People(name, age, id);
                    Hotel hotel1 = new Hotel(count, type, people);
                    hotel.add(hotel1);
                    break;
                }
                case 2: {
                    System.out.println("Enter id: ");
                    String id = scanner.next();
                    hotel.removeID(id);
                    break;
                }
                case 3: {
                    System.out.println("Enter id: ");
                    String id = scanner.next();
                    System.out.println(hotel.Calculate(id));
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
