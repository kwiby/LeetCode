package Easy;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class First_Bad_Version {
    public int firstBadVersion(int n) {
        int L = 0, R = n - 1;

        while (L <= R) {
            n = R - (R - L)/2;

            if (isBadVersion(n)) {
                R = n - 1;
            } else {
                L = n + 1;
            }
        }

        return L;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
