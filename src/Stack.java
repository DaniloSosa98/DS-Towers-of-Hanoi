
public class Stack<E> {

    private LinkedList<E> theList;

    public Stack() {
        theList = new LinkedList();
    }

    public void push(E item) {
        theList.insertFirst(item);
    }

    public Node pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    public void displayStack() {
        System.out.print("");
        theList.display();
    }

}
