package VongLap;

import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = scanner.nextInt();
        long giaiThua = 1;

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println(n + "! = " + giaiThua);
        scanner.close();
    }
}