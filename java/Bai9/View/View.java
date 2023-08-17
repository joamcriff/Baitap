package Bai9.View;

import Bai9.Controller.Control;
import Bai9.Model.BienLai;
import Bai9.Model.KhachHang;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Control BienLai = new Control();
        while (true){
            System.out.println("Choose 1: To add information");
            System.out.println("Choose 2: To remove information");
            System.out.println("Choose 3: To modify information");
            System.out.println("Choose 4: To sum money");
            System.out.println("Choose 5: To exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter Address");
                    int address = scanner.nextInt();
                    System.out.println("Enter Id");
                    String id = scanner.next();
                    System.out.println("Enter New Count");
                    int newCount = scanner.nextInt();
                    System.out.println("Enter Old Count");
                    int oldCount = scanner.nextInt();
                    KhachHang kh = new KhachHang(name, address, id);
                    BienLai bl = new BienLai(oldCount,newCount, kh);
                    BienLai.addBienLai(bl);
                    break;
                }
                case 2: {
                    System.out.println("Enter id");
                    String id = scanner.next();
                    BienLai.remove(id);
                    break;
                }
                case 3: {
                    BienLai.modify();
                    break;
                }
                case 4: {
                   BienLai.Sum();
                   break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}
