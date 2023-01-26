import java.util.*;

public class SortTheStack {
    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int element = stack.pop();
        sort(stack);
        addInStack(stack, element);
    }

    private static void addInStack(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element < stack.peek()) {
            stack.push(element);
            return;
        }

        int tempElem = stack.pop();
        addInStack(stack, element);
        stack.push(tempElem);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(3);

        sort(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
