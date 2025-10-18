package SwitchCase;

import java.util.Scanner;

public class XacDinhGioiTinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã giới tính (0: Nam, 1: Nữ, 2: Khác): ");
        int maGioiTinh = scanner.nextInt();
        String gioiTinh;

        switch (maGioiTinh) {
            case 0:
                gioiTinh = "Nam";
                break;
            case 1:
                gioiTinh = "Nữ";
                break;
            case 2:
                gioiTinh = "Khác";
                break;
            default:
                gioiTinh = "Mã không hợp lệ";
                break;
        }
        System.out.println("Giới tính tương ứng là: " + gioiTinh);

        scanner.close();
    }
}