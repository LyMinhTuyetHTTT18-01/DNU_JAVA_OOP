package Mang;

import java.util.Scanner;

public class MangNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Mảng theo thứ tự ngược lại là:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}