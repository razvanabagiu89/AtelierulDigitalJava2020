package lab6.ch6;

class Print {

    static void spiralPrint(int rowEnd, int colEnd, int a[][]) {
        int i, rowStart = 0, colStart = 0;

        while (rowStart < rowEnd && colStart < colEnd) {
            for (i = colStart; i < colEnd; ++i) {
                System.out.print(a[rowStart][i] + " ");
            }
            rowStart++;

            for (i = rowStart; i < rowEnd; ++i) {
                System.out.print(a[i][colEnd - 1] + " ");
            }
            colEnd--;

            if (rowStart < rowEnd) {
                for (i = colEnd - 1; i >= colStart; --i) {
                    System.out.print(a[rowEnd - 1][i] + " ");
                }
                rowEnd--;
            }

            if (colStart < colEnd) {
                for (i = rowEnd - 1; i >= rowStart; --i) {
                    System.out.print(a[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
