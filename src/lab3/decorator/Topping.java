package lab3.decorator;

public abstract class Topping extends Beverage {

    private Beverage wrappedBeverage;

    public Topping(String name, int cost,  Beverage wrappedBeverage) {
        super(name, cost);
        this.wrappedBeverage = wrappedBeverage;
    }

    public int getCost() {
        return super.getCost() + wrappedBeverage.getCost();
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + " " + this.name;
    }
}
