package VongLap;

import java.util.Scanner;

public class InSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = scanner.nextInt();

        System.out.println("Các số chẵn nhỏ hơn hoặc bằng " + n + " là:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // In xuống dòng cho đẹp

        scanner.close();
    }
}