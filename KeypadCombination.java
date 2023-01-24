// keypad combination code is same as the search in sorted array

public class KeypadCombination {
    public static boolean search(int[][] nums, int key) {
        int i = 0;
        int j = nums[0].length - 1;

        while (i < nums.length && j >= 0) {
            int currElement = nums[i][j];
            if (currElement == key)
                return true;
            if (currElement > key) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
    };

    System.out.println(search(nums, 14));
    }
}
