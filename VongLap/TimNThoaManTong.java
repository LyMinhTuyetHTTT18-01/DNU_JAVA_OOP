package VongLap;

import java.util.Scanner;

public class TimNThoaManTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương S: ");
        int s = scanner.nextInt();

        long tong = 0;
        int n = 0;

        while (tong + (n + 1) <= s) {
            n++;
            tong += n;
        }

        System.out.println("Số N nhỏ nhất để tổng > S là: " + (n + 1));
        System.out.println("Số N lớn nhất để tổng <= S là: " + n);

        scanner.close();
    }
}