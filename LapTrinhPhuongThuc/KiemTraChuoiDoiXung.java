package LapTrinhPhuongThuc;

public class KiemTraChuoiDoiXung {

    public static boolean laChuoiDoiXung(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Chuỗi 'racecar' có đối xứng không? " + laChuoiDoiXung("racecar")); // true
        System.out.println("Chuỗi 'hello' có đối xứng không? " + laChuoiDoiXung("hello"));     // false
    }
}