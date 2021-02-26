
public class LinkedList<E> {

    private Node<E> first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(E dd) {
        Node newDisk = new Node(dd);
        newDisk.next = first;
        first = newDisk;
    }

    public Node<E> deleteFirst() {
        Node<E> temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}
