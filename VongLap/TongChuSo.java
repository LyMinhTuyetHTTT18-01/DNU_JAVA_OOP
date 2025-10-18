package VongLap;

import java.util.Scanner;

public class TongChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số tự nhiên N: ");
        int n = scanner.nextInt();
        int soGoc = n;
        int tong = 0;

        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }

        System.out.println("Tổng các chữ số của " + soGoc + " là: " + tong);
        scanner.close();
    }
}