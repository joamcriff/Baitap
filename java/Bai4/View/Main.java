package Bai4.View;

import Bai4.Controller.Town;
import Bai4.Model.GroupFamily;
import Bai4.Model.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Town town = new Town();
        while (true) {
            System.out.println("Choose 1: To add family");
            System.out.println("Choose 2: To show family");
            System.out.println("Choose 3: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Enter n family");
                    int n = scanner.nextInt();
                    for(int a=0; a<n; a++) {
                        System.out.println("Enter num of people " + (a+1));
                        int num = scanner.nextInt();
                        System.out.println("Enter Address" + (a+1));
                        int address = scanner.nextInt();
                        GroupFamily groupFamily = new GroupFamily(num, address);
                        for (int b=0; b<num; b++){
                            System.out.println("Enter name"+ (b+1));
                            String name = scanner.next();
                            System.out.println("Enter age"+ (b+1));
                            int age = scanner.nextInt();
                            System.out.println("Enter Job"+ (b+1));
                            String job = scanner.next();
                            System.out.println("Enter Id"+ (b+1));
                            String id = scanner.next();
                            People people = new People(name, age, job, id);
                            groupFamily.addPeople(people);
                        }
                        town.addFamily(groupFamily);
                        break;
                    }
                }
                case 2: {
                    town.show();
                    break;
                }
                case 3: {
                    return;
                }
            }
        }
    }
}
