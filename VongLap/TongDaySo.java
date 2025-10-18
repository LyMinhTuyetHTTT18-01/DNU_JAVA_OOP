package VongLap;

import java.util.Scanner;

public class TongDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = scanner.nextInt();
        long tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += (long)i * (i + 1);
        }

        System.out.println("Tổng S = 1*2 + 2*3 + ... + N*(N+1) là: " + tong);
        scanner.close();
    }
}