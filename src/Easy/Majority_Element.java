package Easy;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;

        for (int x : nums) {
            if (x == num) {
                count++;
            } else if (count == 0) {
                num = x;
            } else {
                count--;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
}
