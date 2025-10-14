package CauLenhDieuKien;

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Tính căn bậc hai của N
            double canBacHai = Math.sqrt(n);
            // Kiểm tra xem căn bậc hai có phải là số nguyên không (sử dụng logic ví dụ 8)
            if (canBacHai == (int) canBacHai) {
                System.out.println(n + " là số chính phương.");
            } else {
                System.out.println(n + " không phải là số chính phương.");
            }
        } else {
            System.out.println("Vui lòng nhập số nguyên dương.");
        }
        scanner.close();
    }
}