import java.util.*;

public class LargestAreaHistogram {
    public static int getLargestArea(int[] histogram) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < histogram.length) {
            if (stack.isEmpty() || histogram[stack.peek()] <= histogram[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                maxArea = Math.max(maxArea, histogram[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            maxArea = Math.max(maxArea, histogram[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = {6, 2, 5, 4, 5, 1, 6};
        System.out.println("Largest area in histogram: " + getLargestArea(histogram));
    }
}
