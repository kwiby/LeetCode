package Easy;

public class Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        int L = 1;
        int R = num / 2;

        while (L <= R) {
            int mid = (R + L) / 2;

            if (mid == num/mid && num % mid == 0) {
                return true;
            } else if (mid < num/mid) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 16;

        System.out.println(isPerfectSquare(num));
    }
}
