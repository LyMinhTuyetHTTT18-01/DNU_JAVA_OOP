package BienVaTinhToan;

import java.util.Scanner;

public class HoanDoiGiaTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên a
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        // Nhập vào số nguyên b
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        // In ra giá trị ban đầu để so sánh
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // --- Bắt đầu quá trình hoán đổi ---

        // Bước 1: Tạo một biến tạm 'temp' và lưu giá trị của 'a' vào đó (Đổ nước từ cốc A sang cốc C)
        int temp = a;

        // Bước 2: Gán giá trị của 'b' cho 'a' (Đổ nước từ cốc B sang cốc A)
        a = b;

        // Bước 3: Gán giá trị của 'temp' (giá trị gốc của 'a') cho 'b' (Đổ nước từ cốc C sang cốc B)
        b = temp;

        // --- Kết thúc quá trình hoán đổi ---

        // In ra kết quả sau khi hoán đổi
        System.out.println("Sau khi hoán đổi:  a = " + a + ", b = " + b);

        scanner.close();
    }
}