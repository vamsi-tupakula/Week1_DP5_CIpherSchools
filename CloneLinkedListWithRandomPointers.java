public class CloneLinkedListWithRandomPointers {
    public static Node createClone(Node head) {
        Node original = head;

        if (head == null)
            return head;

        while (original != null && original.next != null) {
            Node cloneNode = new Node(original.data);
            Node next = original.next;
            original.next = cloneNode;
            cloneNode.next = next;
            original = original.next.next;
        }
        original.next = new Node(original.data);
        original = head;

        while (original != null && original.next != null) {
            if (original.random != null) {
                original.next.random = original.random.next;
            }
            original = original.next.next;
        }

        original = head;
        Node copy = head.next;
        Node newHead = head.next;

        while (copy.next != null && original.next != null) {
            original.next = original.next.next;
            copy.next = copy.next.next;
            original = original.next;
            copy = copy.next;
        }

        original.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        // main code goes here
    }
}
