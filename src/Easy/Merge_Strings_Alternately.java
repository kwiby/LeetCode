package Easy;

public class Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder concatStr = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            concatStr.append(word1.charAt(i));
            concatStr.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            concatStr.append(word1.substring(minLength));
        } else if (word2.length() > word1.length()) {
            concatStr.append(word2.substring(minLength));
        }

        return concatStr.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));
    }
}
