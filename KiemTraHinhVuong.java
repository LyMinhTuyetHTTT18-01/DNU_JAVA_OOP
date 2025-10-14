package CauLenhDieuKien;

import java.util.Scanner;

public class KiemTraHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập vào chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        // Hình chữ nhật là hình vuông nếu 2 cạnh bằng nhau và > 0
        if (chieuDai == chieuRong && chieuDai > 0) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây không phải là hình vuông.");
        }
        scanner.close();
    }
}
