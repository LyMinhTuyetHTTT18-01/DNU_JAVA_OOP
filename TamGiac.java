package BienVaTinhToan;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài 3 cạnh a, b, c
        System.out.print("Nhập vào cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập vào cạnh c: ");
        double c = scanner.nextDouble();

        // Tính chu vi
        double chuVi = a + b + c;

        // Tính diện tích bằng công thức Heron
        // 1. Tính nửa chu vi (p)
        double p = chuVi / 2;
        // 2. Áp dụng công thức Heron: S = sqrt(p * (p-a) * (p-b) * (p-c))
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        // In kết quả
        System.out.println("Chu vi của tam giác là: " + chuVi);
        System.out.println("Diện tích của tam giác là: " + dienTich);

        scanner.close();
    }
}