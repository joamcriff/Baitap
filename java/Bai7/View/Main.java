package Bai7.View;

import Bai7.Controller.Controller;
import Bai7.Model.GiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller CB = new Controller();
        while (true){
            System.out.println("Choose 1: To add giao vien");
            System.out.println("Choose 2: To remove giao vien");
            System.out.println("Choose 3: To Calculator");
            System.out.println("Choose 4: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Enter luong cung");
                    int luongCung = scanner.nextInt();
                    System.out.println("Enter luong thuong");
                    int luongThuong = scanner.nextInt();
                    System.out.println("Enter tien phat");
                    int tienPhat = scanner.nextInt();
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter age");
                    int age = scanner.nextInt();
                    System.out.println("Enter Home Town");
                    String homeTown = scanner.next();
                    System.out.println("Enter Id");
                    String id = scanner.next();
                    GiaoVien gv = new GiaoVien(luongCung,luongThuong, tienPhat,name,age,homeTown,id);
                    CB.add(gv);
                    break;
                }
                case 2: {
                    System.out.println("Enter id");
                    String id = scanner.next();
                    CB.remove(id);
                    break;
                }
                case 3: {
                    System.out.println("Enter id");
                    String id = scanner.next();
                    CB.tinhLuong(id);
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
