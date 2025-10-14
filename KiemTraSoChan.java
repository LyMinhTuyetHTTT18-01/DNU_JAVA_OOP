package CauLenhDieuKien;

import java.util.Scanner;

public class KiemTraSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int n = scanner.nextInt();

        // Nếu N chia hết cho 2 (dư 0) thì là số chẵn
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }
        scanner.close();
    }
}