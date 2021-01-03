package lab5.ch5;

public class ArrayNotSortedException extends Exception {
    public ArrayNotSortedException() {
        super("Failed, array is not sorted.");
    }
}
