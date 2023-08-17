package Bai7.Model;

public class CBGV {
    private int luongCung;
    private int tienThuong;
    private int tienPhat;
    private int luongThucLinh;

    public CBGV(int luongCung, int tienThuong, int tienPhat) {
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongThucLinh = luongThucLinh;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(int luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }
}
