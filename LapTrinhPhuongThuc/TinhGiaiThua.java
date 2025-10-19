package LapTrinhPhuongThuc;

public class TinhGiaiThua {

    public static long tinhGiaiThua(int n) {
        if (n < 0) {
            return -1; // Hoặc ném ra một ngoại lệ
        }
        long ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }

    public static void main(String[] args) {
        System.out.println("Giai thừa của 5 là: " + tinhGiaiThua(5)); // 120
    }
}