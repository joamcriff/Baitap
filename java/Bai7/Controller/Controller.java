package Bai7.Controller;

import Bai7.Model.GiaoVien;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<GiaoVien> giaoViens;
    public Controller() {
        this.giaoViens = new ArrayList<>();
    }

    public void add(GiaoVien giaoVien) {
        this.giaoViens.add(giaoVien);
    }
    public void remove(String id) {
        this.giaoViens.removeIf(t->t.getId().equals(id));
    }
    public void tinhLuong(String id) {
        GiaoVien giaoVien = this.giaoViens.stream().filter(i->i.getId().equals(id)).findFirst().orElse(null);

        giaoVien.setLuongThucLinh(giaoVien.getLuongCung() + giaoVien.getTienThuong() - giaoVien.getTienPhat());
        System.out.println(giaoVien.getLuongThucLinh());
    }
}
