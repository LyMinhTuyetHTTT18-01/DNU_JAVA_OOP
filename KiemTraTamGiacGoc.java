package CauLenhDieuKien;

import java.util.Scanner;

public class KiemTraTamGiacGoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập góc a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập góc b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập góc c: ");
        int c = scanner.nextInt();

        // Điều kiện: 3 góc phải dương và tổng bằng 180
        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("a, b, c là độ lớn 3 góc của một tam giác.");
        } else {
            System.out.println("a, b, c không phải là độ lớn 3 góc của một tam giác.");
        }
        scanner.close();
    }
}