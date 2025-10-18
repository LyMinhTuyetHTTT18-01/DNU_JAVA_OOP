package Mảng;

import java.util.Scanner;

public class InPhanTuDauCuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N (N > 0): ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Phần tử đầu tiên: " + a[0]);
        System.out.println("Phần tử cuối cùng: " + a[n - 1]);

        scanner.close();
    }
}