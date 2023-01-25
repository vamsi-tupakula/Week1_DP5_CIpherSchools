import java.util.*;

public class FindFirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] alph = new int[26];
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alph[c - 'a']++;
            if (map.keySet().size() < 26) {
                if (!map.containsKey(c)) {
                    map.put(c, i);
                }
            }
        }
        int minIdx = s.length();
        for (char c : map.keySet()) {
            if (alph[c - 'a'] == 1) {
                int idx = map.get(c);
                if (minIdx > idx) minIdx = idx;
            }
        }
        return minIdx == s.length() ? -1 : minIdx;
    }
    public static void main(String[] args) {
        String string = "cipherschools";
        int index = firstUniqChar(string);
        if (index != -1)
            System.out.println(string.charAt(index));
    }
}