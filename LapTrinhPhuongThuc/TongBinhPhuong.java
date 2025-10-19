package LapTrinhPhuongThuc;

public class TongBinhPhuong {

    public static long tinhTongBinhPhuong(int n) {
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (long) i * i;
        }
        return tong;
    }

    public static void main(String[] args) {
        // 1*1 + 2*2 + 3*3 = 1 + 4 + 9 = 14
        System.out.println("Tổng bình phương từ 1 đến 3 là: " + tinhTongBinhPhuong(3)); // 14
    }
}