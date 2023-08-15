package Bai3.Model;

public class GroupB extends University{
    public static final String MON_TOAN = "Toan";
    public static final String MON_SINH = "Sinh";
    public static final String MON_HOA = "Hoa";
    public GroupB(String id, String name, String address, int prioritize) {
        super(id, name, address, prioritize);
    }

    @Override
    public String toString() {
        return "Group B{" +
                "Id='" + getId() + '\'' +
                ", Name='" + getName() + '\'' +
                ", Address=" + getAddress() +
                ", Prioritize='" + getPrioritize() + '\'' +
                ", Subject='" + MON_TOAN + "-" + MON_SINH + "-" + MON_HOA +
                '}';
    }
}
