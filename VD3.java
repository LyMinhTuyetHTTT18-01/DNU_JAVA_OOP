import java.util.Scanner;

public class VD3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập chiều dài của hình chữ nhật: ");
            double chieuDai = scanner.nextDouble();

            System.out.print("Nhập chiều rộng của hình chữ nhật: ");
            double chieuRong = scanner.nextDouble();

            if (chieuDai < 0 || chieuRong < 0) {
                System.out.println("Lỗi: Chiều dài hoặc chiều rộng không thể âm!");
            } else {
                double chuVi = 2 * (chieuDai + chieuRong);
                double dienTich = chieuDai * chieuRong;

                System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
                System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập số thực hợp lệ!");
        } finally {
            scanner.close();
        }
    }
}