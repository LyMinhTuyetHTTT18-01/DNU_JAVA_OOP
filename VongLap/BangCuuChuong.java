package VongLap;

import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số (1-9): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        scanner.close();
    }
}