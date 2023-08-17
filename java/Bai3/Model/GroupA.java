package Bai3.Model;

public class GroupA extends University{
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    public GroupA(String id, String name, String address, int prioritize) {
        super(id, name, address, prioritize);
    }

    @Override
    public String toString() {
        return "Group A{" +
                "Id='" + getId() + '\'' +
                ", Name='" + getName() + '\'' +
                ", Address=" + getAddress() +
                ", Prioritize='" + getPrioritize() + '\'' +
                ", Subject='" + MON_TOAN + "-" + MON_LY + "-" + MON_HOA +
                '}';
    }
}
