package Bai4.Controller;

import Bai4.Model.GroupFamily;
import Bai4.Model.People;

import java.util.*;

public class Town {
    private static Set<GroupFamily> groupFamilies = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    public Town() {
        this.groupFamilies = groupFamilies;
    }

    public void addFamily(GroupFamily family) {
            this.groupFamilies.add(family);
    }

    public void show() {
        for(GroupFamily family : this.groupFamilies) {
            family.hienThiThongTin();
        }
    }
}
