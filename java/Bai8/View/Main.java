package Bai8.View;

import Bai8.Controller.Controller;
import Bai8.Model.SinhVien;
import Bai8.Model.TheMuon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller TheMuon = new Controller();
        while (true){
            System.out.println("Choose 1: To add card");
            System.out.println("Choose 2: To remove card");
            System.out.println("Choose 3: To show card");
            System.out.println("Choose 4: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter age");
                    int age = scanner.nextInt();
                    System.out.println("Class");
                    int aClass = scanner.nextInt();
                    System.out.println("Enter Ma Phieu");
                    String maPhieu = scanner.next();
                    System.out.println("Enter Ngay Muon");
                    String ngayMuon = scanner.next();
                    System.out.println("Enter Han Tra");
                    String hanTra = scanner.next();
                    System.out.println("Enter Id");
                    String id = scanner.next();
                    SinhVien sv = new SinhVien(name,age,aClass);
                    TheMuon tm = new TheMuon(maPhieu,ngayMuon,hanTra,id,sv);
                    TheMuon.add(tm);
                    break;
                }
                case 2: {
                    System.out.println("Enter id");
                    String id = scanner.next();
                    TheMuon.remove(id);
                    break;
                }
                case 3: {
                    TheMuon.show();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
