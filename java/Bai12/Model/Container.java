package Bai12.Model;

public class Container extends QuanLy {
    public int ton;
    public Container(String id, String manual, int year, int price, String color, int ton) {
        super(id, manual, year, price, color);
        this.ton = ton;
    }

    public int getTon() {
        return ton;
    }

    public void setTon(int ton) {
        this.ton = ton;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id='" + getId() + '\'' +
                ", Manual='" + getManual() + '\'' +
                ", Year=" + getYear() +
                ", Price='" + getPrice() + '\'' +
                ", Color='" + getColor() + '\'' +
                ", Ton='" + getTon() + '\'' +
                '}';
    }
}
