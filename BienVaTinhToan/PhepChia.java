package BienVaTinhToan;

import java.util.Scanner;

public class PhepChia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên a
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        // Nhập số nguyên b
        System.out.print("Nhập vào số nguyên b (khác 0): ");
        int b = scanner.nextInt();

        // Để thực hiện phép chia số thực, ta ép kiểu một trong hai toán hạng
        // sang kiểu double.
        // Sau đó, dùng phép nối chuỗi (+) để tạo ra chuỗi kết quả mong muốn
        // và in ra bằng một lệnh duy nhất.
        System.out.println(a + " / " + b + " = " + ((double) a / b));

        scanner.close();
    }
}