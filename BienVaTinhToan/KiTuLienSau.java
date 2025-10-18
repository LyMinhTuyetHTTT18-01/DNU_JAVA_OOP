package BienVaTinhToan;

import java.util.Scanner;

public class KiTuLienSau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu nhập ký tự
        System.out.print("Nhập vào một ký tự thường (từ a đến y): ");

        // Scanner không có hàm nextChar(), nên ta đọc một chuỗi bằng next()
        // và lấy ký tự đầu tiên bằng charAt(0).
        char ch = scanner.next().charAt(0);

        // Trong Java, ký tự (char) có thể được coi như một số nguyên (mã ASCII).
        // Ký tự liền sau sẽ có mã ASCII lớn hơn 1 đơn vị.
        // Ta cộng 1 vào ký tự và ép kiểu kết quả trở lại thành char.
        char kyTuLienSau = (char) (ch + 1);

        // In kết quả
        System.out.println("Ký tự liền sau '" + ch + "' là: " + kyTuLienSau);

        scanner.close();
    }
}