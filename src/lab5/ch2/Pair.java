package lab5.ch2;

public class Pair<T> {

    private T first;
    private T second;

    public Pair(T firstElem, T secondElem) {
        this.first = firstElem;
        this.second = secondElem;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
