package CauLenhDieuKien;

import java.util.Scanner;

public class KiemTraInThuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một ký tự: ");
        // Đọc chuỗi và lấy ký tự đầu tiên
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' là chữ cái in thường.");
        } else {
            System.out.println("'" + ch + "' không phải là chữ cái in thường.");
        }
        scanner.close();
    }
}