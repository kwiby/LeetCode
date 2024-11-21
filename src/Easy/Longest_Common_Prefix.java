package Easy;

public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(str)) {
                str = str.substring(0, str.length() - 1);

                if (str.isEmpty()) return "";
            }
        }

        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
