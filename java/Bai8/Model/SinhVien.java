package Bai8.Model;

public class SinhVien {
    private String name;
    private int age;
    private int aClass;

    public SinhVien(String name, int age, int aClass) {
        this.name = name;
        this.age = age;
        this.aClass = aClass;
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

    public int getaClass() {
        return aClass;
    }

    public void setaClass(int aClass) {
        this.aClass = aClass;
    }
}
