package Bai11;


import Bai11.Controller.SoPhucController;
import Bai11.Model.SoPhuc;
import Bai11.View.SoPhucView;

public class Main {
    public static void main(String[] args) {
            SoPhucView view = new SoPhucView();
            SoPhucController controller = new SoPhucController(view);
        while (true) {
            controller.xulySoPhuc();
        }
    }
}
