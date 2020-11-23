package lab2.ch3;

public class Spider extends Animal {

    public Spider(int legs) {
        super(8);
    }

    public void eat() {
        super.eat();
        System.out.println(" like a spider");
    }


}
