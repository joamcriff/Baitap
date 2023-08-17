package Bai14.Model;

public class NormalStudent extends Information{
    private int englishScore;
    private int entryTestScore;
    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, int entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(int entryTestScore) {
        this.entryTestScore = entryTestScore;
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
                ", englishScore='" + getEnglishScore() + '\'' +
                ", entryTestScore='" + getEntryTestScore() + '\'' +
                '}';
    }
}
