package Bai3.Model;

public class GroupC extends University {
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";
    public GroupC(String id, String name, String address, int prioritize) {
        super(id, name, address, prioritize);
    }
    @Override
    public String toString() {
        return "Group C{" +
                "Id='" + getId() + '\'' +
                ", Name='" + getName() + '\'' +
                ", Address=" + getAddress() +
                ", Prioritize='" + getPrioritize() + '\'' +
                ", Subject='" + MON_VAN + "-" + MON_SU + "-" + MON_DIA +
                '}';
    }
}
