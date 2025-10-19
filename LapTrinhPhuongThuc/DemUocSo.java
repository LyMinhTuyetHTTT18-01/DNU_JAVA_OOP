package LapTrinhPhuongThuc;

public class DemUocSo {

    public static int demUocSo(int n) {
        if (n <= 0) {
            return 0;
        }
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        System.out.println("Số ước của 12 là: " + demUocSo(12)); // 6 (1, 2, 3, 4, 6, 12)
    }
}