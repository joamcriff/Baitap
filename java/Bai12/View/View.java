package Bai12.View;

import Bai12.Model.Car;
import Bai12.Model.Container;
import Bai12.Model.Motor;
import Bai12.Model.QuanLy;
import Bai2.Model.BookModel;
import Bai2.Model.MagazineModel;
import Bai2.Model.NewspaperModel;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    enum Type {
        Car,
        Container,
        Motor
    }
   public void getChoice() {
       System.out.println("Choose 1: To add Xe");
       System.out.println("Choose 2: To remove Xe");
       System.out.println("Choose 3: To search manual");
       System.out.println("Choose 4: To search color");
       System.out.println("Choose 5: To exit");
   }

   public QuanLy nhapPhuongTien() {
       Type type = null;
       System.out.println("Choose 1: To add Car");
       System.out.println("Choose 2: To add Container");
       System.out.println("Choose 3: To add Motor");
        int i = scanner.nextInt();
        switch (i) {
            case 1: {
                type = type.Car;
                break;
            }
            case 2: {
                type = type.Container;
                break;
            }
            case 3: {
                type = type.Motor;
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
       System.out.print("Enter ID: ");
       String id = scanner.next();
       System.out.print("Enter manual:");
       String manual = scanner.next();
       System.out.print("Enter year: ");
       int year = scanner.nextInt();
       System.out.print("Enter price: ");
       int price = scanner.nextInt();
       System.out.print("Enter color: ");
       String color = scanner.next();
       switch (type) {
           case Car: {
               System.out.print("Enter num seat: ");
               int numSeat = scanner.nextInt();
               System.out.print("Enter type: ");
               String typeS = scanner.next();
               break;
           }
           case Container: {
               System.out.print("Enter ton: ");
               int ton = scanner.nextInt();
               break;
           }
           case Motor: {
               System.out.print("Enter wattage: ");
               int wattage = scanner.nextInt();
               break;
           }
       }
       return null;
   }
    public String NhapId() {
        System.out.println("Nhap id");
        return scanner.next();
    }
    public String nhapHangSanXuat() {
        System.out.print("Enter manufacturer: ");
        return scanner.next();
    }

    public String nhapMauXe() {
        System.out.print("Enter color: ");
        return scanner.next();
    }
}
