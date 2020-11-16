package lab1;

public class Challenge4 {

    public int pairOf3(int[] array) {

        int pairs = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                for (int k = j + 1; k < array.length; k++) {

                    if ((array[i] + array[j] + array[k]) == 0) {
                        pairs++;
                        // to be ignored
                        array[i] = Integer.MAX_VALUE;
                        array[j] = Integer.MAX_VALUE;
                        array[k] = Integer.MAX_VALUE;
                    }
                }
            }
        }
        return pairs;
    }
}
