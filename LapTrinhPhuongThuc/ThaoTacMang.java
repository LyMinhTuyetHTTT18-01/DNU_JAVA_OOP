package LapTrinhPhuongThuc;

import java.util.Arrays;

public class ThaoTacMang {
  public static void inMang(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] daoNguocMang(int[] arr) {
        int[] mangMoi = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mangMoi[i] = arr[arr.length - 1 - i];
        }
        return mangMoi;
    }

    public static void main(String[] args) {
        int[] mangGoc = {1, 2, 3, 4, 5};

        System.out.print("Mảng gốc là: ");
        inMang(mangGoc); // [1, 2, 3, 4, 5]

        int[] mangDaoNguoc = daoNguocMang(mangGoc);
        System.out.print("Mảng sau khi đảo ngược là: ");
        inMang(mangDaoNguoc); // [5, 4, 3, 2, 1]
    }
}