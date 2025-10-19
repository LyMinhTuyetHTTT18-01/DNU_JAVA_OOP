package LapTrinhPhuongThuc;

public class KiemTraSoTuNhien {

    public static boolean laSoTuNhien(int n) {
        return n >= 0;
    }

    public static void main(String[] args) {
        System.out.println("Số 10 có phải số tự nhiên không? " + laSoTuNhien(10)); // true
        System.out.println("Số -5 có phải số tự nhiên không? " + laSoTuNhien(-5)); // false
    }
}