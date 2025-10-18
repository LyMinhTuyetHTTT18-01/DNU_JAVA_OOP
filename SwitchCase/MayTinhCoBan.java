package SwitchCase;

import java.util.Scanner;

public class MayTinhCoBan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char phepToan = scanner.next().charAt(0);

        switch (phepToan) {
            case '+':
                System.out.printf("Kết quả: %.2f + %.2f = %.2f\n", a, b, a + b);
                break;
            case '-':
                System.out.printf("Kết quả: %.2f - %.2f = %.2f\n", a, b, a - b);
                break;
            case '*':
                System.out.printf("Kết quả: %.2f * %.2f = %.2f\n", a, b, a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.printf("Kết quả: %.2f / %.2f = %.2f\n", a, b, a / b);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.printf("Kết quả: %.2f %% %.2f = %.2f\n", a, b, a % b);
                } else {
                    System.out.println("Lỗi: Không thể thực hiện phép chia lấy dư cho 0.");
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
                break;
        }

        scanner.close();
    }
}