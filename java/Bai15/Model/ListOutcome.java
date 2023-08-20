package Bai15.Model;

import java.util.Scanner;

public class ListOutcome {
    private String nameSemester;
    private double pointAverage;

    public ListOutcome(String nameSemester, double pointAverage) {
        this.nameSemester = nameSemester;
        this.pointAverage = pointAverage;
    }


    public String getNameSemester() {
        return nameSemester;
    }

    public void setNameSemester(String nameSemester) {
        this.nameSemester = nameSemester;
    }

    public double getPointAverage() {
        return pointAverage;
    }

    public void setPointAverage(double pointAverage) {
        this.pointAverage = pointAverage;
    }

    @Override
    public String toString() {
        return "Hoc ki " + getNameSemester() + ": " + getPointAverage();
    }
}
