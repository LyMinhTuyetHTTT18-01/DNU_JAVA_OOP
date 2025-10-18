package ChuoiJava;

import java.util.Scanner;

public class KiemTraChuoiDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi để kiểm tra: ");
        String input = scanner.nextLine();
        boolean laChuoiDoiXung = true;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                laChuoiDoiXung = false;
                break;
            }
            left++;
            right--;
        }

        if (laChuoiDoiXung) {
            System.out.println("'" + input + "' là chuỗi đối xứng.");
        } else {
            System.out.println("'" + input + "' không phải là chuỗi đối xứng.");
        }

        scanner.close();
    }
}