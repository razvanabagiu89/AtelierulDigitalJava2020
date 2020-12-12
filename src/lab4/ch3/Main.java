package lab4.ch3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        used in case read from file
        File file = new File("./src/lab4/ch3/input1.txt");
        Scanner in = new Scanner(file);
         */

        ArrayList<String> anagrams = new ArrayList<>();
        String test = "listen";

        // compute number of possible unique permutations of letters in string
        int noPermutations = test.length();
        for(int i = test.length() - 1; i > 0; i--) {
            noPermutations *= i;
        }

        for (int i = 0; i < noPermutations; i++) {

            List<String> letters = Arrays.asList(test.split(""));
            Collections.shuffle(letters);
            StringBuilder builder = new StringBuilder();
            for (String letter : letters) {
                builder.append(letter);
            }

            String addMe = builder.toString();
            // will consider only unique permutations
            if (!anagrams.contains(addMe)) {
                anagrams.add(addMe);
            }
            else {
                i--;
            }
        }
        System.out.println(anagrams);
    }
}
