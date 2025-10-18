package ChuoiJava;

import java.util.Scanner;

public class DemSoTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        String[] tu = input.split(" ");

        System.out.println("Số từ trong chuỗi là: " + tu.length);

        scanner.close();
    }
}