import java.util.Scanner;

public class VD4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện tam giác
        if (isValidTriangle(a, b, c)) {
            // Tính chu vi
            double chuVi = a + b + c;

            // Tính diện tích theo công thức Heron
            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // In kết quả
            System.out.printf("Chu vi tam giác: %.2f\n", chuVi);
            System.out.printf("Diện tích tam giác: %.2f\n", dienTich);
        } else {
            System.out.println("Ba cạnh vừa nhập không tạo thành một tam giác hợp lệ!");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) && (a + b > c) && (b + c > a) && (a + c > b);
    }
}