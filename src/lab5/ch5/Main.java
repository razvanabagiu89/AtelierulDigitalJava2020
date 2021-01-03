package lab5.ch5;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        BinarySearch<Integer> search = new BinarySearch<>();

        int index = search.binarySearch(arr, 0, arr.length, 3);
        System.out.println("Element is at position: " + index);
    }
}
