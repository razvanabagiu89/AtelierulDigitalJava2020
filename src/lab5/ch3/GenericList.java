package lab5.ch3;

public class GenericList<T> implements IGenericList<T> {

    private IGenericNode<T> root;
    private IGenericNode<T> currentNode;

    public GenericList(T rootValue) {
        this.root = new GenericNode<>(rootValue);
        this.currentNode = this.root;
    }

    @Override
    public void insert(T element) {
        GenericNode<T> newNode = new GenericNode<>(element);
        // set current value
        currentNode.setNext(newNode);
        // iterate to next
        currentNode = currentNode.getNext();
    }

    @Override
    public void println() {

        IGenericNode<T> current = root;

        // print until null is found
        while (current.getNext() != null) {
            System.out.print(current.getValue());
            System.out.println();
            current = current.getNext();
        }
    }
}
