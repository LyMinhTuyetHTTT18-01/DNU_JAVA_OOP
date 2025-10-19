package LapTrinhPhuongThuc;

public class ChuSoDauTien {

    public static int getFirstDigit(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Chữ số đầu tiên của 110 là: " + getFirstDigit(123));     // 1
        System.out.println("Chữ số đầu tiên của 2006 là: " + getFirstDigit(98765)); // 9
    }
}