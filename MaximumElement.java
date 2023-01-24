public class MaximumElement {
    public static int findMax(int[] arr, int index) {
        if (index >= arr.length) {
            return Integer.MIN_VALUE;
        }

        return Math.max(arr[index], findMax(arr, index + 1));

    }
    public static void main(String[] args) {
        int[] arr = {5, 71, 19, 20, 13, 27};
        System.out.println(findMax(arr, 0));
    }
}