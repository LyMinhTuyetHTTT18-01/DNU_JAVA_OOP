package VongLap;

import java.util.Scanner;

public class KiemTraLuyThuaCua2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println(n + " không phải là lũy thừa của 2.");
            return;
        }

        int temp = n;
        while (temp % 2 == 0) {
            temp /= 2;
        }

        if (temp == 1) {
            System.out.println(n + " là một lũy thừa của 2.");
        } else {
            System.out.println(n + " không phải là lũy thừa của 2.");
        }

        scanner.close();
    }
}