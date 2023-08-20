package Bai15.Model;

import java.util.HashSet;
import java.util.Set;

public class InformationStudent {
    private String id;
    private String name;
    private String dOB;
    private int year;
    private int entryPoint;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;
    private Set<ListOutcome> listOutcomes;

//    public InformationStudent(){};

    public InformationStudent(InformationStudent other) {
        this.id = other.id;
        this.name = other.name;
        this.dOB = other.dOB;
        this.year = other.year;
        this.entryPoint = other.entryPoint;
        this.listOutcomes = other.listOutcomes;
    }
    public InformationStudent(String id, String name, String dOB, int year, int entryPoint,String department , Set<ListOutcome> listOutcomes) {
        this.id = id;
        this.name = name;
        this.dOB = dOB;
        this.year = year;
        this.entryPoint = entryPoint;
        this.department = department;
        this.listOutcomes = listOutcomes;
    }

    public void addOutcome(ListOutcome outcome) {
        listOutcomes.add(outcome);
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

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(int entryPoint) {
        this.entryPoint = entryPoint;
    }

    public Set<ListOutcome> getListOutcomes() {
        return listOutcomes;
    }

    public void setListOutcomes(Set<ListOutcome> listOutcomes) {
        this.listOutcomes = listOutcomes;
    }
}
