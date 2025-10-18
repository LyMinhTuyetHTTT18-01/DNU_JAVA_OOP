package Mang;

import java.util.Scanner;

public class TinhTongTheoDieuKien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        long tong = 0;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && i % 2 != 0) {
                tong += a[i];
            }
        }

        System.out.println("Tổng các phần tử chẵn ở chỉ số lẻ là: " + tong);

        scanner.close();
    }
}