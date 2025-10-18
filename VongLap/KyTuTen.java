package VongLap;

import java.util.Scanner;

public class KyTuTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn: ");
        String ten = scanner.nextLine();

        for (char kyTu : ten.toCharArray()) {
            System.out.println(kyTu);
        }

        scanner.close();
    }
}