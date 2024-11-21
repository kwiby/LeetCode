package Easy;

public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = r - (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }
}
