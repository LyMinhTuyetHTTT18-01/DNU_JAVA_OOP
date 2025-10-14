package CauLenhDieuKien;

import java.util.Scanner;

public class ChuoiDaiHon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = scanner.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        // So sánh độ dài của hai chuỗi bằng .length()
        if (a.length() >= b.length()) {
            System.out.println("Chuỗi dài hơn (hoặc bằng nhau): " + a);
        } else {
            System.out.println("Chuỗi dài hơn: " + b);
        }
        scanner.close();
    }
}
