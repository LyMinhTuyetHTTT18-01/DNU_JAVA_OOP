package ChuoiJava;

import java.util.Scanner;

public class KiemTraPangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi để kiểm tra pangram: ");
        String input = scanner.nextLine().toLowerCase();

        boolean[] daXuatHien = new boolean[26];
        int soKyTuDuyNhat = 0;

        for (char kyTu : input.toCharArray()) {
            if (kyTu >= 'a' && kyTu <= 'z') {
                int index = kyTu - 'a';
                if (!daXuatHien[index]) {
                    daXuatHien[index] = true;
                    soKyTuDuyNhat++;
                }
            }
        }

        if (soKyTuDuyNhat == 26) {
            System.out.println("Đây là một chuỗi pangram.");
        } else {
            System.out.println("Đây không phải là chuỗi pangram.");
        }

        scanner.close();
    }
}