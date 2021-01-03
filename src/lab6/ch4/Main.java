package lab6.ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        shuffle all elements until the conditions
        are met
         */

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);

        while(true) {

            int ok = 0;
            // -1 checks for < and 1 for >
            int comparison = -1;

            for(int i = 0; i < list.size() - 1; i++) {
                if(ok == 1)
                    break;

                if(comparison == -1) {
                    if(list.get(i) > list.get(i+1))
                        ok = 1; // failed
                    else {
                        comparison = 1;
                    }
                }
                else {
                    if(list.get(i) < list.get(i+1))
                        ok = 1; // failed
                    else {
                        comparison = -1;
                    }
                }
            }
            if(ok == 1) // if failed shuffle again
                Collections.shuffle(list);
            if(ok == 0) // never failed
                break;
        }
        System.out.println(list);
    }
}
