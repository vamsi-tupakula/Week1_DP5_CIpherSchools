public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyNode<Integer> node1 = new SinglyNode<>(1);
        SinglyNode<Integer> node2 = new SinglyNode<>(2);
        node1.next = node2;

        node1.printList();
    }
}
