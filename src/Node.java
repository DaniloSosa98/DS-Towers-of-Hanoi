
public class Node<E> {

    public E data;
    public Node<E> next;

    public Node(E dd) {
        data = dd;
    }

    public void displayNode() {
        System.out.print(data + " ");
    }
}
