package Bai10.View;

import java.util.Scanner;

public class View {
    public String nhapVanBan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập văn bản: ");
        return scanner.nextLine();
    }

    public void hienThiKetQua(int soTu, int soLuongA, String vanBanChuanHoa) {
        System.out.println("Số từ trong văn bản: " + soTu);
        System.out.println("Số lượng ký tự A: " + soLuongA);
        System.out.println("Văn bản sau khi chuẩn hoá: " + vanBanChuanHoa);
    }
}
