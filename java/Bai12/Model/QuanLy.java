package Bai12.Model;

public class QuanLy {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String manual;
    private int year;
    private int price;
    private String color;

    public QuanLy(String id, String manual, int year, int price, String color) {
        this.id = id;
        this.manual = manual;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
