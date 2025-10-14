package BienVaTinhToan;

import java.util.Scanner;

public class HoanDoiKhongBienPhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên a
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        // Nhập vào số nguyên b
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        // In ra giá trị ban đầu
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // --- Bắt đầu quá trình hoán đổi không dùng biến phụ ---

        // Bước 1: a sẽ lưu giữ tổng của cả a và b
        a = a + b;

        // Bước 2: b = (tổng a và b) - (b ban đầu) => b sẽ nhận được giá trị của a ban đầu
        b = a - b;

        // Bước 3: a = (tổng a và b) - (b mới, tức a ban đầu) => a sẽ nhận được giá trị của b ban đầu
        a = a - b;

        // --- Kết thúc quá trình hoán đổi ---

        // In ra kết quả sau khi hoán đổi
        System.out.println("Sau khi hoán đổi:  a = " + a + ", b = " + b);

        scanner.close();
    }
}