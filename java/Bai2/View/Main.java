package Bai2.View;

import Bai2.Controller.Controller;
import Bai2.Model.BookModel;
import Bai2.Model.DocumentModel;
import Bai2.Model.MagazineModel;
import Bai2.Model.NewspaperModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller documents = new Controller();
        enum TypeDoc {
            BookModel,
            MagazineModel,
            NewspaperModel
        }
        while(true) {
            System.out.println("Choose 1: To add doc");
            System.out.println("Choose 2: To remove doc");
            System.out.println("Choose 3: To show doc");
            System.out.println("Choose 4: To search doc");
            System.out.println("Choose 5: To exit");
            int i = scanner.nextInt();
            TypeDoc typeDoc = null;
            switch (i) {
                case 1: {
                    System.out.println("Choose 1: To add book");
                    System.out.println("Choose 2: To add magazine");
                    System.out.println("Choose 3: To add newspaper");
                    int a = scanner.nextInt();
                    switch (a) {
                        case 1: {
                            typeDoc = typeDoc.BookModel;
                            break;
                        }
                        case 2: {
                            typeDoc = typeDoc.MagazineModel;
                            break;
                        }
                        case 3: {
                            typeDoc = typeDoc.NewspaperModel;
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    System.out.print("Enter ID: ");
                    String id = scanner.next();
                    System.out.print("Enter nxb:");
                    String nxb = scanner.next();
                    System.out.print("Enter number: ");
                    int number = scanner.nextInt();
                    switch (typeDoc) {
                        case BookModel: {
                            System.out.print("Enter Author: ");
                            String author = scanner.next();
                            System.out.print("Enter NumPage: ");
                            int numPage = scanner.nextInt();
                            BookModel book = new BookModel(id, nxb, number, numPage, author);
                            documents.add(book);
                            break;
                        }
                        case MagazineModel: {
                            System.out.print("Enter Num Release: ");
                            int numRelease = scanner.nextInt();
                            System.out.print("Enter Month Release: ");
                            int monthRelease = scanner.nextInt();
                            MagazineModel magazine = new MagazineModel(id, nxb, number, numRelease, monthRelease);
                            documents.add(magazine);
                            break;
                        }
                        case NewspaperModel: {
                            System.out.print("Enter Day Release: ");
                            int dayRelease = scanner.nextInt();
                            NewspaperModel newspaper = new NewspaperModel(id, nxb, number, dayRelease);
                            documents.add(newspaper);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter id want to remove");
                    String id = scanner.next();
                    documents.remove(id);
                    break;
                }
                case 3: {
                    documents.show();
                    break;
                }
                case 4: {
                    System.out.println("Choose 1: To Search Book");
                    System.out.println("Choose 2: To Search Magazine");
                    System.out.println("Choose 3: To Search Newspaper");
                    int choose = scanner.nextInt();
                    switch (choose) {
                        case 1: {
                            documents.searchBook();
                            break;
                        }
                        case 2: {
                            documents.searchMagazine();
                            break;
                        }
                        case 3: {
                            documents.searchNewspaper();
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
