package Bai12;

import Bai12.Controller.QuanLyControl;
import Bai12.View.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        QuanLyControl control = new QuanLyControl(view);
        while(true) {
            control.QuanLyXe();
        }
    }
}
