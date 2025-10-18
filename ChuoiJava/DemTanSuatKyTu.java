package ChuoiJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemTanSuatKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        Map<Character, Integer> tanSuat = new HashMap<>();

        for (char kyTu : input.toCharArray()) {
            tanSuat.put(kyTu, tanSuat.getOrDefault(kyTu, 0) + 1);
        }

        System.out.println("Tần suất xuất hiện của các ký tự:");
        for (Map.Entry<Character, Integer> entry : tanSuat.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }

        scanner.close();
    }
}