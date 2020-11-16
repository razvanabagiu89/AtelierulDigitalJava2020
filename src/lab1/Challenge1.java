package lab1;

public class Challenge1 {

    public static void main(String[] args) {

        System.out.println("Challenge 1");

        for(int i = 1; i <= 100; i++) {
            System.out.println(i + ": ");

            if (i % 5 == 0 && i % 3 == 0)
                System.out.println("Fizz Buzz");

            else if(i % 3 == 0)
                System.out.println("Fizz");

            else if(i % 5 == 0)
                System.out.println("Buzz");

            else if(i % 7 == 0)
                System.out.println("Rizz");

            else if(i % 11 == 0)
                System.out.println("Jazz");

        }
    }
}
