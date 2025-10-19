package LapTrinhPhuongThuc;

import java.util.Scanner;

public class InLoiChao {

    public static void chao(String ten) {
        System.out.println("Hello " + ten);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String tenNguoiDung = scanner.nextLine();
        chao(tenNguoiDung);
        scanner.close();
    }
}