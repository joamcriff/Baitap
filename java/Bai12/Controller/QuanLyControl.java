package Bai12.Controller;

import Bai12.Model.QuanLy;
import Bai12.View.View;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuanLyControl {
    private Set<QuanLy> quanLyList;
    private View view;
    public QuanLyControl(View view) {
        this.quanLyList = new HashSet<>();
        this.view = view;
    }

    public void QuanLyXe() {
        Scanner scanner = new Scanner(System.in);
        view.getChoice();
        int i = scanner.nextInt();
        switch (i) {
            case 1: {
                QuanLy xe = view.nhapPhuongTien();
                quanLyList.add(xe);
                break;
            }
            case 2: {
                String id = view.NhapId();
                remove(id);
                break;
            }
            case 3: {
                String manual = view.nhapHangSanXuat();
                searchManual(manual);
                break;
            }
            case 4: {
                String color = view.nhapMauXe();
                searchColor(color);
                break;
            }
            case 5: {
                System.exit(0);
            }
        }
    }

    public void add(QuanLy quanLy){
        this.quanLyList.add(quanLy);
    }
    public void remove(String id) {
        this.quanLyList.removeIf(i->i.getId().equals(id));
    }
    public void searchManual(String manual) {
        this.quanLyList.stream().filter(i->i.getManual().equals(manual)).forEach(a -> System.out.println(a.toString()));
    }
    public void searchColor(String color) {
        this.quanLyList.stream().filter(i->i.getManual().equals(color)).forEach(a -> System.out.println(a.toString()));
    }
}
