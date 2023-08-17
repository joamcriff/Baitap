package Bai3.Model;

public class University {
    private String id;
    private String name;
    private String address;
    private int prioritize;

    public University(String id, String name, String address, int prioritize) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(int prioritize) {
        this.prioritize = prioritize;
    }
}
