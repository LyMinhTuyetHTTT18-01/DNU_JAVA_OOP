package LapTrinhPhuongThuc;

public class TinhTongMang {

    public static long tinhTongMang(int[] arr) {
        long tong = 0;
        for (int phanTu : arr) {
            tong += phanTu;
        }
        return tong;
    }

    public static void main(String[] args) {
        int[] mangSo = {1, 5, 9, 12, -3};
        System.out.println("Tổng của mảng là: " + tinhTongMang(mangSo)); // 24
    }
}