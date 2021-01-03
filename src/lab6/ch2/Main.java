package lab6.ch2;

import static lab6.ch2.PascalTriangle.ncr;

public class Main {
    public static void main(String args[]){

        // hardcode rows or get input from user
        int rows = 5;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < rows - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
    }
}
