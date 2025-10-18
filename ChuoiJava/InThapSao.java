package ChuoiJava;

import java.util.Scanner;

public class InThapSao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao N của tháp: ");
        int n = scanner.nextInt();

        StringBuilder thapSao = new StringBuilder();
        for (int i = 0; i < n; i++) {
            thapSao.append("*");
            System.out.println(thapSao);
        }

        scanner.close();
    }
}