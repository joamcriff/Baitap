package Bai10.Controller;

import Bai10.Model.VanBan;
import Bai10.View.View;


public class Control {
    private VanBan model;
    private View view;

    public Control(VanBan model, View view) {
        this.model = model;
        this.view = view;
    }

    public void xuLyVanBan() {
        String vanBan = view.nhapVanBan();
        model = new VanBan(vanBan);

        int soTu = model.demSoTu();
        int soLuongA = model.demSoLuongKyTuA();

        model.chuanHoaVanBan();
        String vanBanChuanHoa = model.getText();

        view.hienThiKetQua(soTu, soLuongA, vanBanChuanHoa);
    }
}
