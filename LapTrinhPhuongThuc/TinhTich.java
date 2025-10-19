package LapTrinhPhuongThuc;

public class TinhTich {

    public static long tinhTich(int a, int b, int c) {
        return (long) a * b * c;
    }

    public static void main(String[] args) {
        long ketQua = tinhTich(5, 6, 7);
        System.out.println("Tích của 5, 6, và 7 là: " + ketQua); // Kết quả: 210
    }
}