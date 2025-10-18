package Mang;

import java.util.Scanner;

public class TimMaxVaDemSoLuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                dem++;
            }
        }

        System.out.println("Giá trị lớn nhất là " + max);
        System.out.println("Số lượng phần tử có giá trị lớn nhất là " + dem);

        scanner.close();
    }
}