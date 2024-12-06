package Easy;

public class Find_the_Difference {
    public static char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;

        for (char x  : s.toCharArray()) {
            sSum += x;
        }
        for (char x  : t.toCharArray()) {
            tSum += x;
        }

        return (char) (tSum - sSum);
    }

    public static void main(String[] args) {
        String s = "";
        String t = "y";

        System.out.println(findTheDifference(s, t));
    }
}
