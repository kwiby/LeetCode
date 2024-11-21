package Easy;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }

        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}
