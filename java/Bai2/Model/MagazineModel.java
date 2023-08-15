package Bai2.Model;

public class MagazineModel extends DocumentModel {
    private int numRelease;
    private int monthRelease;
    public MagazineModel(String id, String publish, int count, int numRelease, int monthRelease) {
        super(id, publish, count);
        this.numRelease = numRelease;
        this.monthRelease = monthRelease;
    }

    public int getNumRelease() {
        return numRelease;
    }

    public void setNumRelease(int numRelease) {
        this.numRelease = numRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id='" + getId() + '\'' +
                ", Imprint='" + getPublish() + '\'' +
                ", Release number=" + getCount() +
                ", Number release='" + getNumRelease() + '\'' +
                ", Month release='" + getMonthRelease() + '\'' +
                '}';
    }
}
