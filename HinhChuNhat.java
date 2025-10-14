package BienVaTinhToan;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài
        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();

        // Nhập chiều rộng
        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        // Tính chu vi theo công thức: P = (dài + rộng) * 2
        double chuVi = (chieuDai + chieuRong) * 2;

        // Tính diện tích theo công thức: S = dài * rộng
        double dienTich = chieuDai * chieuRong;

        // In kết quả
        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);

        scanner.close();
    }
}