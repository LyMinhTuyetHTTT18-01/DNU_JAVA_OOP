package BienVaTinhToan;

import java.util.Scanner;

public class TinhHaiSoNguyen {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên a
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        // Nhập số nguyên b
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        // Ép kiểu (double) cho a để kết quả phép chia là số thực
        double thuong = (double) a / b;

        // In kết quả ra màn hình
        System.out.println("Tổng của " + a + " và " + b + " là: " + tong);
        System.out.println("Hiệu của " + a + " và " + b + " là: " + hieu);
        System.out.println("Tích của " + a + " và " + b + " là: " + tich);
        System.out.println("Thương của " + a + " và " + b + " là: " + thuong);

        // Đóng scanner để giải phóng tài nguyên
        scanner.close();
    }
}