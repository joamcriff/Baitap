package Bai15;


import Bai15.Controller.ControlInfor;
import Bai15.View.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ControlInfor control = new ControlInfor(view);
        while(true) {
            control.start();
        }
    }
}
