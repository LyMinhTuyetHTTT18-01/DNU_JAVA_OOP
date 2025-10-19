package LapTrinhPhuongThuc;

public class ChuyenNhiPhan {

    public static String toBinary(int n) {
        if (n == 0) return "0";
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        System.out.println("Số 7 ở dạng nhị phân là: " + toBinary(7));   // 111
        System.out.println("Số 10 ở dạng nhị phân là: " + toBinary(10)); // 1010
    }
}