package BienVaTinhToan;

import java.util.Scanner;

public class ChuSoGanCuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập vào một số nguyên N (có ít nhất 2 chữ số): ");
        int n = scanner.nextInt();

        // Bước 1: Lấy giá trị tuyệt đối của N để xử lý số âm
        int soDuongN = Math.abs(n);

        // Bước 2: Bỏ đi chữ số cuối cùng bằng cách chia nguyên cho 10
        // Ví dụ: 123 -> 12; 928743 -> 92874
        int soDaBoChuSoCuoi = soDuongN / 10;

        // Bước 3: Lấy chữ số cuối cùng của số mới (chính là chữ số gần cuối của N)
        // bằng phép chia lấy dư cho 10
        // Ví dụ: 12 % 10 = 2; 92874 % 10 = 4
        int chuSoGanCuoi = soDaBoChuSoCuoi % 10;

        // In kết quả
        System.out.println("Chữ số gần cuối của " + n + " là: " + chuSoGanCuoi);

        scanner.close();
    }
}