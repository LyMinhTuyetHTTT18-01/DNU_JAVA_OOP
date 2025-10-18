package CauLenhDieuKien;

import java.util.Scanner;

public class SoSanhChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = scanner.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        // Dùng hàm .equals() để so sánh nội dung của hai chuỗi
        if (a.equals(b)) {
            System.out.println("Hai chuỗi giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }
        scanner.close();
    }
}