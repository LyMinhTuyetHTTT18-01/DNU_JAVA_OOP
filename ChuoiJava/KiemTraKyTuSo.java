package ChuoiJava;

import java.util.Scanner;

public class KiemTraKyTuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        boolean coChuaSo = false;

        for (char kyTu : input.toCharArray()) {
            if (Character.isDigit(kyTu)) {
                coChuaSo = true;
                break;
            }
        }

        if (coChuaSo) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số nào.");
        }

        scanner.close();
    }
}