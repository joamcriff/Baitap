package Bai14.Model;

public class GoodStudent extends Information implements Comparable<GoodStudent>{
    private double gpa;
    private String bestRewardName;
    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
    @Override
    public void showInformation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gradeLevel='" + getGradeLevel() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", doB=" + getDoB() +
                ", sex='" + getSex() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", universityName=" + getUniversityName() +
                ", gpa='" + getGpa() + '\'' +
                ", bestRewardName='" + getBestRewardName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(GoodStudent other) {
        if (getGpa() == other.getGpa())
            return 0;
        else if (getGpa() > other.getGpa())
            return 1;
        else
            return -1;
    }
}
