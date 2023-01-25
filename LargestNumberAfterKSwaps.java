public class LargestNumberAfterKSwaps {
    static String max = "0";

    public static String swap(String string, int i, int j) {
        char ith = string.charAt(i);
        char jth = string.charAt(j);

        String left = string.substring(0, i);
        String middle = string.substring(i + 1, j);
        String right = string.substring(j + 1);

        return left + jth + middle + ith + right;
    }

    public static void findMax(String string, int k) {

        if (Integer.parseInt(string) > Integer.parseInt(max)) {
            max = string;
        }

        if (k == 0) {
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) < string.charAt(j)) {
                    string = swap(string, i, j);
                    findMax(string, k - 1);
                    string = swap(string, i, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "254";
        findMax(str, 1);
        System.out.println(max);
    } 
}