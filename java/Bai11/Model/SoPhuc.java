package Bai11.Model;

public class SoPhuc {
    private double PhanThuc;
    private double PhanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.PhanThuc = phanThuc;
        this.PhanAo = phanAo;
    }

    public SoPhuc() {

    }

    public double getPhanThuc() {
        return PhanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        PhanThuc = phanThuc;
    }

    public double getPhanAo() {
        return PhanAo;
    }

    public void setPhanAo(double phanAo) {
        PhanAo = phanAo;
    }
    public SoPhuc sum(SoPhuc soPhuc) {
        double newPhanThuc = this.PhanThuc + soPhuc.getPhanThuc();
        double newPhanAo = this.PhanAo + soPhuc.getPhanAo();
        return new SoPhuc(newPhanThuc, newPhanAo);
    }

    public SoPhuc mutil(SoPhuc soPhuc) {
        double newPhanThuc = this.PhanThuc * soPhuc.getPhanThuc() - this.PhanAo * soPhuc.getPhanAo();
        double newPhanAo = this.PhanThuc * soPhuc.getPhanAo() + this.PhanAo * soPhuc.getPhanThuc();
        return new SoPhuc(newPhanThuc, newPhanAo);
    }
}
