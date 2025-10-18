package ChuoiJava;

import java.util.Scanner;

public class DemKyTuA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Số lượng ký tự 'a' trong chuỗi là: " + count);

        scanner.close();
    }
}