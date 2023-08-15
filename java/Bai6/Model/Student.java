package Bai6.Model;

public class Student {
    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    private String aClass;
    private String name;
    private int age;
    private String homeTown;

    public Student(String aClass, String name, int age, String homeTown) {
        this.aClass = aClass;
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Information{" +
                "Class: " + getaClass()+ '\'' +
                "Name: " + getName() + '\'' +
                "Age: " + getAge() + '\'' +
                "Home Town: " + getHomeTown() + '\'' +
                "}";
    }
}
