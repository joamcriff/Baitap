package Bai4.Model;

import java.util.ArrayList;
import java.util.List;

public class GroupFamily {
    private int numOfPeople;
    private int address;
    private List<People> peopleList;

    public GroupFamily(int numOfPeople, int address) {
        this.numOfPeople = numOfPeople;
        this.address = address;
        this.peopleList = new ArrayList<>();
    }

    public void addPeople(People people) {
        peopleList.add(people);
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
    public void hienThiThongTin() {
        System.out.println("Số nhà: " + getAddress());
        System.out.println("Số thành viên: " + getNumOfPeople());
        System.out.println("Danh sách thành viên:");
        for (People people : peopleList) {
            System.out.println("Họ tên: " + people.getName());
            System.out.println("Tuổi: " + people.getAge());
            System.out.println("Nghề nghiệp: " + people.getJob());
            System.out.println("CMND: " + people.getId());
        };
    }
}
