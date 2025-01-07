package Easy;

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public static int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;

        for (int x : nums) {
            if (x < 0) {
                neg++;
            } else if (x > 0) {
                pos++;
            }
        }

        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};

        System.out.println(maximumCount(nums));
    }
}
