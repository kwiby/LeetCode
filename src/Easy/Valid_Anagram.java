package Easy;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for (char x : s.toCharArray()) {
            freq[x - 'a']++;
        }
        for (char x : t.toCharArray()) {
            freq[x - 'a']--;
        }

        for (int x : freq) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        System.out.println(isAnagram(s, t));
    }
}
