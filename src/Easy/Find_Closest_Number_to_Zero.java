package Easy;

public class Find_Closest_Number_to_Zero {
    public static int findClosestNumber(int[] nums) {
        int min = Math.abs(nums[0]);
        for (int x : nums) {
            min = Math.min(min, Math.abs(x));
        }

        for (int x : nums) {
            if (x == min) {
                return min;
            }
        }

        return -min;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};

        System.out.println(findClosestNumber(nums));
    }
}
