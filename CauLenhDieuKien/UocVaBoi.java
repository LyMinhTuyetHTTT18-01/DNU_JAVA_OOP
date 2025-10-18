package CauLenhDieuKien;

import java.util.Scanner;

public class UocVaBoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();

        // b là ước của a => a % b == 0
        // b là bội của c => b % c == 0
        if (a % b == 0 && b % c == 0) {
            System.out.println("Điều kiện thỏa mãn: b là ước của a và là bội của c.");
        } else {
            System.out.println("Điều kiện không thỏa mãn.");
        }
        scanner.close();
    }
}