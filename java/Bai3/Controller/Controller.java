package Bai3.Controller;

import Bai3.Model.University;

import java.util.HashSet;
import java.util.Set;

public class Controller {
    Set<University> universities;

    public Controller() {
        this.universities = new HashSet<>();
    };

    public void add(University university) {
        this.universities.add(university);
    }
    public void show() {
        for(University university : this.universities) {
            System.out.println(university.toString());
        }
    }
    public void search(String id) {
        this.universities.stream().filter(i->i.getId().contains(id)).forEach(a-> System.out.println(a));
    }
}
