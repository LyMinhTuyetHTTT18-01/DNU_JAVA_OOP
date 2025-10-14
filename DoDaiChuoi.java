package BienVaTinhToan;

import java.util.Scanner;

public class DoDaiChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến kiểu chuỗi (String)
        String ten;

        // Yêu cầu người dùng nhập tên
        System.out.print("Nhập vào tên của bạn: ");

        // Sử dụng nextLine() để đọc cả dòng, bao gồm cả dấu cách
        ten = scanner.nextLine();

        // Lấy độ dài của chuỗi bằng phương thức .length()
        int doDai = ten.length();

        // In kết quả
        System.out.println("Tên của bạn có " + doDai + " ký tự.");

        scanner.close();
    }
}
