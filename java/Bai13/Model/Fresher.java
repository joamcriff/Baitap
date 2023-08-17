package Bai13.Model;

public class Fresher extends Employee{
    public int getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    private int Graduation_date;
    private String Graduation_rank;
    private String Education;
    public Fresher(String id, String fullName, String birthDay, String phone, String email, int Graduation_date, String Graduation_rank, String Education) {
        super(id, fullName, birthDay, phone, email);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
        this.employeeType = 1;
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
                ", graduationDate=" + getGraduation_date() +
                ", graduationRank='" + getGraduation_rank() + '\'' +
                ", universityName='" + getEducation() + '\'' +
                '}';
    }
}
