package VongLap;

import java.util.Scanner;

public class KiemTraSoDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập vào số nguyên N (N > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println("Bạn đã nhập thành công số: " + n);
        scanner.close();
    }
}