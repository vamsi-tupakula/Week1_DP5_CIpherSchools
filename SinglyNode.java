public class SinglyNode<T> {
    T data;
    SinglyNode<T> next;

    /**
     * !constructor with no parameters
     */
    public SinglyNode() {
        this.data = null;
        this.next = null;
    }

    /**
     * constructor with one parameter
     * @param val
     */
    public SinglyNode(T val) {
        this.data = val;
        this.next = null;
    }

    /**
     * constructor with two parameters
     * @param val
     * @param next
     */
    public SinglyNode(T val, SinglyNode<T> next) {
        this.data = val;
        this.next = next;
    }

    /**
     * method to print the list
     */
    public void printList() {
        SinglyNode<T> temp = this;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}