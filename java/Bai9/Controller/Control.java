package Bai9.Controller;

import Bai7.Model.GiaoVien;
import Bai9.Model.BienLai;
import Bai9.Model.KhachHang;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Control {
    private Set<BienLai> bienLais;
    Scanner scanner = new Scanner(System.in);
    public Control() {
        this.bienLais = new HashSet<>();
    }

    public void addBienLai(BienLai bienLai) {
        this.bienLais.add(bienLai);
    }
    public void remove(String id) {
        this.bienLais.removeIf(i->i.getKhachHang().getId().equals(id));
    }
    public void modify() {
        System.out.println("Enter id want modify");
        String id = scanner.nextLine();
        BienLai kh = this.bienLais.stream().filter(i->i.getKhachHang().getId().equals(id)).findFirst().orElse(null);
        System.out.println("Enter name");
        String name = scanner.next();
        kh.getKhachHang().setName(name);
        System.out.println("Enter Address");
        int address = scanner.nextInt();
        kh.getKhachHang().setAddress(address);
        System.out.println("Enter Id");
        String Id = scanner.next();
        kh.getKhachHang().setId(Id);
    }
    public void Sum() {
        for(BienLai bienLai : this.bienLais) {
            System.out.println("Tien bien lai cua " + bienLai.getKhachHang().getName() + ": " + (bienLai.getNewCount()-bienLai.getOldCount())*5);
        }
    }
}
