package LapTrinhPhuongThuc;

public class TinhTong {

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int ketQua = tinhTong(15, 20);
        System.out.println("Tổng của 15 và 20 là: " + ketQua); // Kết quả: 35
    }
}