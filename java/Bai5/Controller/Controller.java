package Bai5.Controller;

import Bai3.Model.University;
import Bai5.Model.Hotel;
import Bai5.Model.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {
    List<Hotel> rooms;

    public Controller() {
        this.rooms = new ArrayList<>();
    };

    public void add(Hotel room) {
        this.rooms.add(room);
    }
    public void removeID(String id) {
        this.rooms.removeIf(t->t.getPeople().getId().equals(id));
    }
    public int Calculate(String id) {
        Hotel people = this.rooms.stream().filter(i->i.getPeople().getId().equals(id)).findFirst().orElse(null);
        if(people == null) {
            return 0;
        }
        return people.giaPhong(people.getType())*people.getCountDay();
    }
}
