package Mảng;

import java.util.Scanner;

public class LocPhanTuChiaHetCho5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean timThay = false;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Các số chia hết cho 5 trong mảng là:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0) {
                System.out.print(a[i] + " ");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tồn tại phần tử nào chia hết cho 5");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}