package lab5.ch5;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        BinarySearch<Integer> binarySearch = new BinarySearch<>();

        int index = binarySearch.binarySearch(arr, 0, arr.length, 3);
        System.out.println("Element found at: " + index);
    }
}
