package Bai10.Model;

public class VanBan {
    private String text;

    public VanBan() {
        this.text = "";
    }

    public VanBan(String st) {
        this.text = st;
    }

    public int demSoTu() {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public int demSoLuongKyTuA() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public void chuanHoaVanBan() {
        text = text.trim();
        text = text.replaceAll("\\s+", " ");
    }

    public String getText() {
        return text;
    }
}
