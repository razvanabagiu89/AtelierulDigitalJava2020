package lab1;

public class Challenge3 {

    public int pairOf2(int[] array) {

        int pairs = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if ((array[i] + array[j]) == 0) {
                    pairs++;
                    // to be ignored
                    array[i] = Integer.MAX_VALUE;
                    array[j] = Integer.MAX_VALUE;
                }
            }
        }
        return pairs;
    }
}
