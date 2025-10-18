package CauLenhDieuKien;

import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số thực: ");
        double num = scanner.nextDouble();

        // Ép kiểu số thực về số nguyên sẽ làm mất phần thập phân
        // Nếu số sau khi ép kiểu bằng số ban đầu thì nó là số nguyên.
        if (num == (int) num) {
            System.out.println(num + " là số nguyên.");
        } else {
            System.out.println(num + " không phải là số nguyên.");
        }
        scanner.close();
    }
}