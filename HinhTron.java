package BienVaTinhToan;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính từ người dùng, có thể là số thực nên dùng double
        System.out.print("Nhập vào bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();

        // Tính chu vi theo công thức: C = 2 * PI * r
        double chuVi = 2 * Math.PI * banKinh;

        // Tính diện tích theo công thức: S = PI * r * r
        double dienTich = Math.PI * banKinh * banKinh;

        // In kết quả ra màn hình
        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Diện tích hình tròn là: " + dienTich);

        scanner.close();
    }
}