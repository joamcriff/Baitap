package Bai12.Model;

public class Car extends QuanLy{
    private int numSeat;

    public int getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(int numSeat) {
        this.numSeat = numSeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    public Car(String id, String manual, int year, int price, String color, int numSeat, String type) {
        super(id, manual, year, price, color);
        this.numSeat = numSeat;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id='" + getId() + '\'' +
                ", Manual='" + getManual() + '\'' +
                ", Year=" + getYear() +
                ", Price='" + getPrice() + '\'' +
                ", Color='" + getColor() + '\'' +
                ", Num Seat='" + getNumSeat() + '\'' +
                ", Type='" + getType() + '\'' +
                '}';
    }
}
