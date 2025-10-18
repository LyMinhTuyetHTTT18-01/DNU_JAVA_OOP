package ChuoiJava;

import java.util.Scanner;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString.toString());

        scanner.close();
    }
}