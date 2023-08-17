package Bai5.Model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int countDay;
    private People people;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Hotel(int countDay, String type, People people) {
        this.countDay = countDay;
        this.type = type;
        this.people = people;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }
    public int giaPhong(String Type) {
        switch (Type) {
            case "A": {
                return 500;

            }
            case "B": {
                return 300;
            }
            case "C": {
                return 100;
            }
            default:
                return 0;
        }
    }
}
