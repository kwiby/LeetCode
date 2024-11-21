package Easy;

public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int sI = 0;
        int tI = 0;

        while (sI < s.length() && tI < t.length()) {
            if (s.charAt(sI) == t.charAt(tI)) {
                sI++;
            }

            tI++;
        }

        return sI == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
