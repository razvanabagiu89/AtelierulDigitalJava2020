package lab9.ch2;

import lab9.ch1.PrintSubscriber;

public class Main {
    public static void main(String[] args) {
        ch2 ch2 = new ch2();
        PrintSubscriber subscriber = new PrintSubscriber();
        ch2.emptyMono().subscribe(subscriber);
        ch2.monoWithNoSignal().subscribe(subscriber);
        ch2.fooMono().subscribe(subscriber);
        ch2.errorMono().subscribe(subscriber);
    }
}
