package BienVaTinhToan;

import java.util.Scanner;

public class ChuSoCuoiCung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n
        System.out.print("Nhập vào một số nguyên N: ");
        int n = scanner.nextInt();

        // Lấy giá trị tuyệt đối để xử lý trường hợp số âm
        int soDuongN = Math.abs(n);

        // Tính chữ số cuối cùng bằng phép chia lấy dư cho 10
        int chuSoCuoi = soDuongN % 10;

        // In kết quả
        System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);

        scanner.close();
    }
}