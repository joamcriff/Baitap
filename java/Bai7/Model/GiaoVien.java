package Bai7.Model;

public class GiaoVien extends CBGV {
    private String name;
    private int age;
    private String homeTown;
    private String id;
    public GiaoVien(int luongCung, int tienThuong, int tienPhat, String name, int age, String homeTown, String id) {
        super(luongCung, tienThuong, tienPhat);
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Information{" +
                "Name: " + getName() + '\'' +
                "Age: " + getAge() + '\'' +
                "Home Town: " + getHomeTown() + '\'' +
                "ID: " + getId() + '\'' +
                "Salary: " + getLuongThucLinh() + '\'' +
                "}";
    }
}
