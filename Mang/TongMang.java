package Mang;

import java.util.Scanner;

public class TongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        long tong = 0;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            tong += a[i];
        }

        System.out.println("Tổng các phần tử của mảng là: " + tong);

        scanner.close();
    }
}