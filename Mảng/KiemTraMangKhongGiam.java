package Mảng;

import java.util.Scanner;

public class KiemTraMangKhongGiam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean laMangKhongGiam = true;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                laMangKhongGiam = false;
                break;
            }
        }

        if (laMangKhongGiam) {
            System.out.println("Mảng là mảng không giảm.");
        } else {
            System.out.println("Mảng không phải là mảng không giảm.");
        }

        scanner.close();
    }
}