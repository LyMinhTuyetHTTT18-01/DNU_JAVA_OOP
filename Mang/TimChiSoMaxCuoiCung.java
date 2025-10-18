package Mang;

import java.util.Scanner;

public class TimChiSoMaxCuoiCung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int giaTriMax = a[0];
        int chiSoMax = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] >= giaTriMax) {
                giaTriMax = a[i];
                chiSoMax = i;
            }
        }

        System.out.println("Chỉ số của phần tử lớn nhất cuối cùng là: " + chiSoMax);

        scanner.close();
    }
}