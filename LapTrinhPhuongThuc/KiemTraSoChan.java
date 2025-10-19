package LapTrinhPhuongThuc;

public class KiemTraSoChan {

    public static boolean laSoChan(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Số 8 có phải số chẵn không? " + laSoChan(8)); // true
        System.out.println("Số 7 có phải số chẵn không? " + laSoChan(7)); // false
    }
}