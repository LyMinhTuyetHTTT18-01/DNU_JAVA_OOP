package LapTrinhPhuongThuc;

public class KiemTraSoNguyenTo {

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Số 29 có phải là số nguyên tố không? " + laSoNguyenTo(29)); // true
        System.out.println("Số 15 có phải là số nguyên tố không? " + laSoNguyenTo(15)); // false
    }
}