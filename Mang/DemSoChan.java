package Mang;

import java.util.Scanner;

public class DemSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int dem = 0;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                dem++;
            }
        }

        System.out.println("Số lượng số chẵn trong mảng là: " + dem);

        scanner.close();
    }
}