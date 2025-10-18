package ChuoiJava;

import java.util.Scanner;

public class InHoaChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        String chuoiInHoa = input.toUpperCase();

        System.out.println("Chuỗi sau khi in hoa: " + chuoiInHoa);

        scanner.close();
    }
}