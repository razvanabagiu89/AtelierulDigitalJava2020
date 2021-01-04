package lab7.ex1;

public class Main {
    public static int v = 0;
    public static void main(String[] args) throws InterruptedException {

        System.out.println("before " + v);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                v++;
                System.out.println(v);
            }
        };

        for(int i = 0; i < 500; i++)
            new Thread(runnable).start();

        Thread.sleep(500);
        System.out.println("after " + v);


    }
}
