package Easy;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Number_of_Balloons {
    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (char x : text.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return Math.min(map.getOrDefault('b', 0),
                Math.min(map.getOrDefault('a', 0),
                        Math.min(map.getOrDefault('l', 0) / 2,
                                Math.min(map.getOrDefault('o', 0) / 2,
                                        map.getOrDefault('n', 0)))));
    }

    public static void main(String[] args) {
        String text = "nlaebolko";

        System.out.println(maxNumberOfBalloons(text));
    }
}
