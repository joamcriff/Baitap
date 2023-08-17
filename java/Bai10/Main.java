package Bai10;

import Bai10.Controller.Control;
import Bai10.Model.VanBan;
import Bai10.View.View;

public class Main {
    public static void main(String[] args) {
        VanBan model = new VanBan();
        View view = new View();
        Control controller = new Control(model, view);

        controller.xuLyVanBan();
    }
}
