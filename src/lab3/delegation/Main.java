package lab3.delegation;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        PayCalculator p = new PayCalculator();

        e.calculatePay(p);
    }
}
