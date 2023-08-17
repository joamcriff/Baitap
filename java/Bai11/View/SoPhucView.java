package Bai11.View;

import Bai11.Model.SoPhuc;

import java.util.Scanner;

public class SoPhucView {
    public SoPhuc nhapSoPhuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan thuc");
        double phanThuc = scanner.nextDouble();
        System.out.println("Nhap phan ao");
        double phanAo = scanner.nextDouble();
        return new SoPhuc(phanThuc, phanAo);
    }

    public void hienThi(SoPhuc soPhuc) {
        System.out.println("Số phức: " + soPhuc.getPhanThuc() + " + " + soPhuc.getPhanAo() + "i");
    }
}
