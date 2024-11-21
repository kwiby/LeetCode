package Easy;

import java.util.HashSet;
import java.util.Set;

public class Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char x : jewels.toCharArray()) {
            set.add(x);
        }

        int count = 0;
        for (char x : stones.toCharArray()) {
            if (set.contains(x)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }
}
