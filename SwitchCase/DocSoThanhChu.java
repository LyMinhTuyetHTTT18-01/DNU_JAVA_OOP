package SwitchCase;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số tự nhiên (0-9): ");
        int so = scanner.nextInt();
        String chuViet;

        switch (so) {
            case 0 -> chuViet = "Không";
            case 1 -> chuViet = "Một";
            case 2 -> chuViet = "Hai";
            case 3 -> chuViet = "Ba";
            case 4 -> chuViet = "Bốn";
            case 5 -> chuViet = "Năm";
            case 6 -> chuViet = "Sáu";
            case 7 -> chuViet = "Bảy";
            case 8 -> chuViet = "Tám";
            case 9 -> chuViet = "Chín";
            default -> chuViet = "Số không hợp lệ";
        }
        System.out.println("Kết quả: " + chuViet);

        scanner.close();
    }
}