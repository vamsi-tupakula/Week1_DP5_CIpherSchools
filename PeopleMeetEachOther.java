/**
 * CLASS 1 PeopleMeetEachOther : SEARCHING AND SORTING (MEET OF TWO PEOPLE OR
 * OBJECT)
 */

public class PeopleMeetEachOther {
    public static boolean isMeetOptimized(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2)
            return false;
        if (p2 > p1 && s2 > s1)
            return false;

        int distanceToBeCovered = Math.abs(p1 - p2);
        int speedUsed = Math.abs(s1 - s2);

        if (distanceToBeCovered % speedUsed == 0)
            return true;

        return false;
    }

    public static boolean isMeet(int p1, int p2, int s1, int s2) {
        if (p1 > p2 && s1 > s2)
            return false;
        if (p2 > p1 && s2 > s1)
            return false;

        // swapping p1 and p2 if p2 is ahead of p1 to get correct ans
        int temp = p1;
        p1 = p2;
        p2 = temp;

        // assuming p1 is ahead of p2
        // time complexity : O(s1 > s2 ? p1 : p2)
        while (p1 >= p2) {
            if (p1 == p2)
                return true;
            p1 += s1;
            p2 += s2;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isMeet(3, 5, 2, 7));
        System.out.println(isMeetOptimized(6, 4, 6, 8));
    }
}