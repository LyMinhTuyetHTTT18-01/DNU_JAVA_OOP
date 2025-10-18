package Mang;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Nhập chỉ số k cần xóa (0 <= k < " + n + "): ");
        int k = scanner.nextInt();

        for (int i = k; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;

        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}