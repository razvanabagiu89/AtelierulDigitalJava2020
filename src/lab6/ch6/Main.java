package lab6.ch6;

import static lab6.ch6.Print.spiralPrint;

public class Main {
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        // Function Call
        spiralPrint(a.length, a[0].length, a);
    }
}
