import java.util.Scanner;

public class VD5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên: ");
        int tuoi = scanner.nextInt();

        if (tuoi > 0 && tuoi <= 150) {
            int namSinh = 2025 - tuoi;

            System.out.printf("Năm sinh của sinh viên là: %d\n", namSinh);
        } else {
            System.out.println("Tuổi không hợp lệ! Vui lòng nhập tuổi từ 1 đến 150.");
        }

        scanner.close();
    }
}