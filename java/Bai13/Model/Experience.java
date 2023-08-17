package Bai13.Model;

public class Experience extends Employee{
    private int ExpInYear;
    private String ProSkill;

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public Experience(String id, String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email);
        this.ExpInYear = expInYear;
        this.employeeType = 0;
        this.ProSkill = proSkill;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthday=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", ExpInYear=" + getExpInYear() +
                ", ProSkill='" + getProSkill() + '\'' +
                '}';
    }
}
