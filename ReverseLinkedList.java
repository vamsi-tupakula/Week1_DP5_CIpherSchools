public class ReverseLinkedList {
    private static SinglyNode<Integer> reverseList(SinglyNode<Integer> head) {
        SinglyNode<Integer> curr = head;
        SinglyNode<Integer> prev = null;
        SinglyNode<Integer> next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return  prev;
    }
    public static void main(String[] args) {
        SinglyNode<Integer> node1 = new SinglyNode<>(1);
        SinglyNode<Integer> node2 = new SinglyNode<>(2);
        SinglyNode<Integer> node3 = new SinglyNode<>(3);
        SinglyNode<Integer> node4 = new SinglyNode<>(4);
        SinglyNode<Integer> node5 = new SinglyNode<>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("original list : ");
        node1.printList();
        System.out.println("reverse list : ");
        node1 = reverseList(node1);
        node1.printList();
    }
}
