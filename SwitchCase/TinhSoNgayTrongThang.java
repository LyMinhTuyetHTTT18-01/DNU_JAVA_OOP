package SwitchCase;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int thang = scanner.nextInt();
        int soNgay;

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12:
                soNgay = 31;
                break;
            case 4, 6, 9, 11:
                soNgay = 30;
                break;
            case 2:
                boolean laNamNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                soNgay = laNamNhuan ? 29 : 28;
                break;
            default:
                soNgay = 0;
                break;
        }

        if (soNgay != 0) {
            System.out.printf("Tháng %d năm %d có %d ngày.\n", thang, nam, soNgay);
        } else {
            System.out.println("Tháng không hợp lệ.");
        }

        scanner.close();
    }
}