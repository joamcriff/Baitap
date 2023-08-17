package Bai4.Model;

import Bai2.Model.DocumentModel;

public class People {
    private String name;
    private int age;
    private String job;
    private String id;
    public People(String name, int age, String job, String id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DocumentModel) {
            DocumentModel another = (DocumentModel) obj;
            if (this.id.equals(another.getId())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return 31 + this.id.hashCode();
    }
}
