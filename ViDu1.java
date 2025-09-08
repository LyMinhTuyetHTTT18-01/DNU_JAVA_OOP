import java.util.Scanner;

class Number {
    private int a;
    private int b;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int tinhTong() {
        return a + b;
    }

    public int tinhHieu() {
        return a - b;
    }

    public int tinhTich() {
        return a * b;
    }

    public String tinhThuong() {
        if (b != 0) {
            return String.valueOf((double) a / b);
        } else {
            return "Khong the chia cho 0";
        }
    }
}

public class ViDu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap so nguyen a: ");
            int a = scanner.nextInt();
            System.out.print("Nhap so nguyen b: ");
            int b = scanner.nextInt();

            Number number = new Number(a, b);
            System.out.println("Tong: " + number.tinhTong());
            System.out.println("Hieu: " + number.tinhHieu());
            System.out.println("Tich: " + number.tinhTich());
            System.out.println("Thuong: " + number.tinhThuong());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Loi: Vui long nhap so nguyen hop le!");
        } finally {
            scanner.close();
        }
    }
}