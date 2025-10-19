package LapTrinhPhuongThuc;

public class KiemTraPangram {

    public static boolean laChuoiPangram(String s) {
        s = s.toLowerCase();
        boolean[] daXuatHien = new boolean[26];
        int dem = 0;

        for (char kyTu : s.toCharArray()) {
            if (kyTu >= 'a' && kyTu <= 'z') {
                int index = kyTu - 'a';
                if (!daXuatHien[index]) {
                    daXuatHien[index] = true;
                    dem++;
                }
            }
        }
        return dem == 26;
    }

    public static void main(String[] args) {
        String test = "The quick brown fox jumps over the lazy dog";
        System.out.println("'" + test + "' có phải là pangram không? " + laChuoiPangram(test)); // true
    }
}