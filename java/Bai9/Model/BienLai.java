package Bai9.Model;

public class BienLai {
    private int oldCount;
    private int newCount;
    private KhachHang khachHang;

    public BienLai(int oldCount, int newCount, KhachHang khachHang) {
        this.oldCount = oldCount;
        this.newCount = newCount;
        this.khachHang = khachHang;
    }

    public int getOldCount() {
        return oldCount;
    }

    public void setOldCount(int oldCount) {
        this.oldCount = oldCount;
    }

    public int getNewCount() {
        return newCount;
    }

    public void setNewCount(int newCount) {
        this.newCount = newCount;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
