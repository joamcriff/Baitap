package Bai12.Model;

public class Motor extends QuanLy {
    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int wattage;
    public Motor(String id, String manual, int year, int price, String color, int wattage) {
        super(id ,manual, year, price, color);
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Book{" +
                "Id='" + getId() + '\'' +
                ", Manual='" + getManual() + '\'' +
                ", Year=" + getYear() +
                ", Price='" + getPrice() + '\'' +
                ", Color='" + getColor() + '\'' +
                ", Wattage='" + getWattage() + '\'' +
                '}';
    }
}
