package lab1;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCHALLENGE 2");
        Challenge2 chall2 = new Challenge2();
        System.out.println("STAGE 1");
        for(int i = 1; i < 101; i++) {
            System.out.println(i + "=> ");
            System.out.println(chall2.compute(i));
        }

        System.out.println("\nSTAGE 2");
        System.out.println(chall2.compute2(101));
        System.out.println(chall2.compute2(303));
        System.out.println(chall2.compute2(105));
        System.out.println(chall2.compute2(10101));

        System.out.println("\nCHALLENGE 3");
        Challenge3 chall3 = new Challenge3();
        int[] array1 = {3, 2, -3 , -2, 3, 0};
        System.out.println(chall3.pairOf2(array1));

        int[] array2 = {1, 1, 0 , -1, -1};
        System.out.println(chall3.pairOf2(array2));

        int[] array3 = {5, 9, -5 , 7, -5};
        System.out.println(chall3.pairOf2(array3));

        System.out.println("\nCHALLENGE 4");
        Challenge4 chall4 = new Challenge4();
        int[] array4 = {-1, -1, -1, 2};
        System.out.println(chall4.pairOf3(array4));
    }
}
