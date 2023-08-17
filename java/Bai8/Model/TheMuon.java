package Bai8.Model;

public class TheMuon {
    private String maPhieu;
    private String ngayMuon;
    private String hanTra;
    private String id;
    private SinhVien sinhVien;

    public TheMuon(String maPhieu, String ngayMuon, String hanTra, String id, SinhVien sinhVien) {
        this.maPhieu = maPhieu;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.id = id;
        this.sinhVien = sinhVien;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Information{" +
                "Ma phieu: " + getMaPhieu() + '\'' +
                "Ngay muon: " + getNgayMuon() + '\'' +
                "Han tra: " + getHanTra() + '\'' +
                "ID: " + getId() + '\'' +
                "Thong tin sinh vien: " + '\'' +
                "Ho ten: " + sinhVien.getName() + '\'' +
                "Tuoi: " + sinhVien.getAge() + '\'' +
                "Lop: " + sinhVien.getaClass() + '\'' +
                "}";
    }
}
