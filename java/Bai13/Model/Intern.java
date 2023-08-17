package Bai13.Model;

public class Intern extends Employee{
    private String Majors;
    private int Semester;
    private String University_name;
    public Intern(String id, String fullName, String birthDay, String phone, String email, String Majors, int Semester, String University_name) {
        super(id, fullName, birthDay, phone, email);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
        this.employeeType = 2;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
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
                ", majors=" + getMajors() +
                ", semester='" + getSemester() + '\'' +
                ", university name='" + getUniversity_name() + '\'' +
                '}';
    }
}
