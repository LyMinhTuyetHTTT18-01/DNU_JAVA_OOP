package LapTrinhPhuongThuc;

public class ChuSoCuoiCung {

    public static int getLastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        System.out.println("Chữ số cuối của 123 là: " + getLastDigit(123));   // 3
        System.out.println("Chữ số cuối của -123 là: " + getLastDigit(-123)); // 3
    }
}