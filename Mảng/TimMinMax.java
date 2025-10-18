package Mảng;

import java.util.Scanner;

public class TimMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
        System.out.println("Giá trị lớn nhất trong mảng: " + max);

        scanner.close();
    }
}