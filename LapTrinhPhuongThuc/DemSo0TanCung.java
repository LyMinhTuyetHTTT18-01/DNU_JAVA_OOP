package LapTrinhPhuongThuc;

public class DemSo0TanCung {

    public static int demSo0TanCung(int n) {
        int dem = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            dem += n / i;
        }
        return dem;
    }

    public static void main(String[] args) {
        System.out.println("Số chữ số 0 tận cùng của 10! là: " + demSo0TanCung(10)); // 2
        System.out.println("Số chữ số 0 tận cùng của 25! là: " + demSo0TanCung(25)); // 6
    }
}
