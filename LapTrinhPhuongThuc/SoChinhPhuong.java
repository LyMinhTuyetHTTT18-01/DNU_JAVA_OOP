package LapTrinhPhuongThuc;

public class SoChinhPhuong {

    public static boolean laSoChinhPhuong(int n) {
        if (n < 0) return false;
        int canBacHai = (int) Math.sqrt(n);
        return canBacHai * canBacHai == n;
    }

    public static void main(String[] args) {
        System.out.println("Số 10 có phải là số chính phương không? " + laSoChinhPhuong(25)); // true
        System.out.println("Số 11 có phải là số chính phương không? " + laSoChinhPhuong(26)); // false
    }
}