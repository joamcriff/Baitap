package Bai11.Controller;

import Bai11.Model.SoPhuc;
import Bai11.View.SoPhucView;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoPhucController {
    private Set<SoPhuc> soPhucs;
    private SoPhucView view;

    public SoPhucController(SoPhucView view) {
        this.view = view;
        this.soPhucs = new HashSet<>();
    }
    public void xulySoPhuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose 1: To add so phuc");
        System.out.println("Choose 2: To show so phuc");
        System.out.println("Choose 3: To sum so phuc");
        System.out.println("Choose 4: To multi so phuc");
        System.out.println("Choose 5: To exit");
        int i = scanner.nextInt();
        switch (i) {
            case 1: {
                SoPhuc soPhuc = view.nhapSoPhuc();
                soPhucs.add(soPhuc);
                break;
            }
            case 2: {
                for (SoPhuc soPhuc : this.soPhucs) {
                    view.hienThi(soPhuc);
                }
                break;
            }
            case 3: {
                System.out.println("Nhap so phuc 1");
                SoPhuc so1 = view.nhapSoPhuc();
                System.out.println("Nhap so phuc 2");
                SoPhuc so2 = view.nhapSoPhuc();
                SoPhuc sum = so1.sum(so2);
                view.hienThi(sum);
                break;
            }
            case 4: {
                System.out.println("Nhap so phuc 1");
                SoPhuc so1 = view.nhapSoPhuc();
                System.out.println("Nhap so phuc 2");
                SoPhuc so2 = view.nhapSoPhuc();
                SoPhuc mutil = so1.mutil(so2);
                view.hienThi(mutil);
                break;
            }
            case 5: {
                System.exit(0);
            }
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }
}
