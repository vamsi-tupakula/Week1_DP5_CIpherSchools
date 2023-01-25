public class DoublyNode {
    Character data;
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode() {
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    public DoublyNode(Character data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
