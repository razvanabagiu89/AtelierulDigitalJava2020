package lab5.ch4;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6,
                                        7, 8, 9, 10};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println();
        }
    }
}
