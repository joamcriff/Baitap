package Bai14.Controller;

import Bai13.View.View;
import Bai14.Model.GoodStudent;
import Bai14.Model.Information;
import Bai14.Model.NormalStudent;

import java.util.*;

public class TuyenSinhControl {
    private List<Information> informations;
    public TuyenSinhControl() {
        this.informations = new ArrayList<>();
    }
    Scanner scanner = new Scanner(System.in);

    public void add(Information information) {
        this.informations.add(information);
    }


    public void selectCandidates() {
        System.out.println("Nhap so luong can tuyen");
        int a = scanner.nextInt();
        List<GoodStudent> student1 = new ArrayList<>();
        for (Information info : this.informations) {
            if (info instanceof GoodStudent) {
                student1.add((GoodStudent) info);
            }
        }
        student1.sort(Comparator.comparing(GoodStudent::getGpa, Comparator.reverseOrder())
                .thenComparing(GoodStudent::getFullName));
        List<Information> selectedCandidates = new ArrayList<>();
        for (int i = 0; i < a && i < student1.size(); i++) {
            selectedCandidates.add(student1.get(i));
        }
        List<NormalStudent> student2 = new ArrayList<>();
        for (Information info : this.informations) {
            if (info instanceof NormalStudent) {
                student2.add((NormalStudent) info);
            }
        }

        if (selectedCandidates.size() < a) {
            student2.sort(Comparator.comparing(NormalStudent::getEntryTestScore, Comparator.reverseOrder())
                            .thenComparing(NormalStudent::getFullName));

            for (int i = selectedCandidates.size(); i < a && i < student2.size(); i++) {
                selectedCandidates.add(student2.get(i));
            }
        }
        for (Information n : selectedCandidates) {
            System.out.println(n);
        }
    }

    public void displayAllStudentsInfo() {

        // Sắp xếp danh sách sinh viên theo yêu cầu
        this.informations.sort(Comparator.comparing(Information::getFullName).reversed()
                .thenComparing(Information::getPhoneNumber));

        // Hiển thị thông tin của tất cả các sinh viên
        for (Information student : this.informations) {
            System.out.println("Full Name: " + student.getFullName());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println("--------------------------------");
        }
    }
}
