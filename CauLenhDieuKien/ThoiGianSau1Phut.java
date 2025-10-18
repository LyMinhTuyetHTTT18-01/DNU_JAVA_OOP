package CauLenhDieuKien;

import java.util.Scanner;

public class ThoiGianSau1Phut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giờ (0-23): ");
        int h = scanner.nextInt();
        System.out.print("Nhập phút (0-59): ");
        int m = scanner.nextInt();

        System.out.println("Thời gian hiện tại: " + h + ":" + m);

        // Tăng phút lên 1
        m = m + 1;

        // Kiểm tra các trường hợp đặc biệt
        if (m == 60) {
            m = 0; // Reset phút về 0
            h = h + 1; // Tăng giờ lên 1
            if (h == 24) {
                h = 0; // Reset giờ về 0 nếu là nửa đêm
            }
        }

        // Dùng System.out.printf để định dạng số có 2 chữ số (vd: 01, 08)
        System.out.printf("Thời gian sau 1 phút: %02d:%02d\n", h, m);
        scanner.close();
    }
}