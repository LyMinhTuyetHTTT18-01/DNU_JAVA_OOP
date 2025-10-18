package SwitchCase;

import java.util.Scanner;

public class XacDinhPhuongHuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự hướng (N, E, S, W): ");
        char kyTu = scanner.next().charAt(0);
        String tenHuong;

        switch (Character.toUpperCase(kyTu)) {
            case 'N' -> tenHuong = "Bắc (North)";
            case 'S' -> tenHuong = "Nam (South)";
            case 'E' -> tenHuong = "Đông (East)";
            case 'W' -> tenHuong = "Tây (West)";
            default -> tenHuong = "Ký tự không hợp lệ";
        }
        System.out.println("Hướng tương ứng là: " + tenHuong);

        scanner.close();
    }
}