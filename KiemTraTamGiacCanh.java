package CauLenhDieuKien;

import java.util.Scanner;

public class KiemTraTamGiacCanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        // Điều kiện: 3 cạnh phải dương và tổng 2 cạnh bất kỳ > cạnh còn lại
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("a, b, c là độ dài 3 cạnh của một tam giác.");
        } else {
            System.out.println("a, b, c không thể là độ dài 3 cạnh của một tam giác.");
        }
        scanner.close();
    }
}