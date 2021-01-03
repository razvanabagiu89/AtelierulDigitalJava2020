package lab5.ch4;

public class ArrayIterator<T> implements  IArrayIterator<T> {

    private T[] arr;
    private int pos = 0;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        if(pos < arr.length) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        return arr[pos++];
    }
}
