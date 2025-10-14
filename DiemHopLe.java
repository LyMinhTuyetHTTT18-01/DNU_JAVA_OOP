package CauLenhDieuKien;

import java.util.Scanner;

public class DiemHopLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào điểm số: ");
        double score = scanner.nextDouble();

        // Sử dụng toán tử VÀ (&&) để kiểm tra đồng thời 2 điều kiện
        if (score >= 0 && score <= 10) {
            System.out.println(score + " là điểm số hợp lệ.");
        } else {
            System.out.println(score + " không phải là điểm số hợp lệ.");
        }
        scanner.close();
    }
}