package Bai2.Model;

public class NewspaperModel extends DocumentModel  {
    private int dayRelease;
    public NewspaperModel(String id, String publish, int count, int dayRelease) {
        super(id, publish, count);
        this.dayRelease = dayRelease;
    }

    public int getDayRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id='" + getId() + '\'' +
                ", Imprint='" + getPublish() + '\'' +
                ", Release number=" + getCount() +
                ", Day release='" + getDayRelease() + '\'' +
                '}';
    }
}
