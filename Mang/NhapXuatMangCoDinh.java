package Mang;

import java.util.Scanner;

public class NhapXuatMangCoDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[5];

        System.out.println("Nhập vào 5 số nguyên:");
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}