package LapTrinhPhuongThuc;

public class TimUocChungLonNhat {

    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("UCLN của 54 và 24 là: " + timUCLN(54, 24)); // 6
    }
}