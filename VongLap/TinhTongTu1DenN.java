package VongLap;

import java.util.Scanner;

public class TinhTongTu1DenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = scanner.nextInt();
        long tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);
        scanner.close();
    }
}