package BienVaTinhToan;

import java.util.Scanner;

public class TinhNamSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Năm mốc để tính toán
        int namHienTai = 2023;

        // Nhập tuổi của sinh viên
        System.out.print("Nhập tuổi của bạn tính đến năm 2023: ");
        int tuoi = scanner.nextInt();

        // Tính năm sinh
        int namSinh = namHienTai - tuoi;

        // In kết quả
        System.out.println("Năm sinh của bạn là: " + namSinh);

        scanner.close();
    }
}