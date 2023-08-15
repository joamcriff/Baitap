package Bai8.Controller;

import Bai8.Model.TheMuon;

import java.util.HashSet;
import java.util.Set;

public class Controller {
    private Set<TheMuon> theMuons;
    public Controller() {
        this.theMuons = new HashSet<>();
    }

    public void add(TheMuon theMuon) {
        this.theMuons.add(theMuon);
    }
    public void remove(String id) {
        this.theMuons.removeIf(i->i.getId().equals(id));
    }
    public void show() {
        for(TheMuon theMuon : this.theMuons) {
            System.out.println(theMuon.toString());
        }
    }
}
