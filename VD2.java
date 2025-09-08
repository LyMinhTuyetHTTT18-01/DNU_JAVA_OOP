import java.util.Scanner;

public class VD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập bán kính của hình tròn: ");
            double banKinh = scanner.nextDouble();

            if (banKinh < 0) {
                System.out.println("Lỗi: Bán kính không thể âm!");
            } else {
                double chuVi = 2 * Math.PI * banKinh;
                double dienTich = Math.PI * banKinh * banKinh;

                System.out.println("Chu vi của hình tròn là: " + chuVi);
                System.out.println("Diện tích của hình tròn là: " + dienTich);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập số thực hợp lệ!");
        } finally {
            scanner.close();
        }
    }
}