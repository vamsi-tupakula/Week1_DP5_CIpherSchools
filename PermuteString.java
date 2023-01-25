public class PermuteString {
    public static String swap(String str, int i, int j) {
        if (i < 0 || i >= str.length() || j < 0 || j >= str.length()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
    

    public static void permute(String string, int i) {
        if (i == string.length() - 1) {
            System.out.println(string);
            return;
        }

        for (int j = i; j < string.length(); j++) {
            string = swap(string, i, j);
            permute(string, i + 1);
            string = swap(string, i, j);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0);
    }
}