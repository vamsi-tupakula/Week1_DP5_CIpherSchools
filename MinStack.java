public class MinStack {
    static class MinNode {
        int data;
        int min;
        MinNode next;
    
        MinNode(int data, int min) {
            this.data = data;
            this.min = min;
            this.next = null;
        }
    }

    static MinNode head;

    public void push(int n) {
        if (head == null) {
            MinNode x = new MinNode(n, n);
            head = x;
        } else {
            MinNode x = new MinNode(n, Math.min(n, head.min));
            x.next = head;
            head = x;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head != null)
            return head.data;
        return -1;
    }

    public int getMin() {
        if (head != null) {
            return head.min;
        }
        return -1;
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(3);
        st.push(10);
        st.push(12);
        st.push(5);
        st.push(2);

        System.out.println(st.getMin());
    }
}
