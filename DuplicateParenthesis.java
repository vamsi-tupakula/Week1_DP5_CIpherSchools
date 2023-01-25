import java.util.*;

public class DuplicateParenthesis {
    public static boolean containsDuplicateParenthesis(String string) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            Character currCharacter = string.charAt(i);

            if (currCharacter != ')') {
                st.push(currCharacter);
            } else {
                int removeElementsCount = 0;
                Character top = st.pop();

                while (top != '(') {
                    st.pop();
                    removeElementsCount++;
                }

                if (removeElementsCount < 1) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        // main code
    }
}