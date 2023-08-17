package Bai2.Controller;

import Bai2.Model.BookModel;
import Bai2.Model.DocumentModel;
import Bai2.Model.MagazineModel;
import Bai2.Model.NewspaperModel;

import java.util.*;

public class Controller {
    private static Set<DocumentModel> documents = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    public Controller() {
        this.documents = documents;
    }

    public void add(DocumentModel document) {
        Optional<DocumentModel> optional = this.documents.stream().filter(t->t.equals(document)).findFirst();
        if (optional.isPresent()) {
            System.out.println("Document exist");
            System.out.println("Do you want fix document");
            System.out.println("Choose 1: OK");
            System.out.println("Choose 2: Deny");
            int a = scanner.nextInt();
            switch (a) {
                case 1: {
                    this.documents.add(document);
                    break;
                }
                case 2: {
                    break;
                }
            }
        }
        this.documents.add(document);
    }

    public void remove(String id) {
        this.documents.removeIf(t -> t.getId().equals(id));
    }
    public void show() {
        for(DocumentModel document : this.documents) {
            System.out.println(document.toString());
        }
    }
    public void searchBook() {
        this.documents.stream().filter(i -> i instanceof BookModel).forEach(a -> System.out.println(a.toString()));
    }
    public void searchNewspaper() {
        this.documents.stream().filter(i -> i instanceof NewspaperModel).forEach(a -> System.out.println(a.toString()));
    }
    public void searchMagazine() {
        this.documents.stream().filter(i -> i instanceof MagazineModel).forEach(a -> System.out.println(a.toString()));
    }
}
