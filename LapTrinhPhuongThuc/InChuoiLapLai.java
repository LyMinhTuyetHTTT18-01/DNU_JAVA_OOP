package LapTrinhPhuongThuc;

public class InChuoiLapLai {

    public static void inChuoi(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        System.out.println("In chuỗi 'Java' 3 lần:");
        inChuoi("Java", 3);
    }
}