package LapTrinhPhuongThuc;

public class TinhDienTichTamGiac {

    // Lưu ý: Ví dụ 3, 4, 5 diện tích là 6, không phải 12.
    public static double tinhDienTich(double a, double b, double c) {
        // Kiểm tra điều kiện tam giác
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1; // Không phải là tam giác
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double dienTich = tinhDienTich(3, 4, 5);
        System.out.printf("Diện tích tam giác có 3 cạnh 3, 4, 5 là: %.2f\n", dienTich); // 6.00
    }
}