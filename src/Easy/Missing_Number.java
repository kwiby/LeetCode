package Easy;

public class Missing_Number {
    public static int missingNumber(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];

        for (int x : nums) {
            arr[x] = true;
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!arr[i]) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));
    }
}
