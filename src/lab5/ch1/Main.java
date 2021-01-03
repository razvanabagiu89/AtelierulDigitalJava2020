package lab5.ch1;

public class Main {
    public static void main(String[] args) {

        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron ronValue = new Ron(20);
        EUR eurValue = new EUR(5);
        USD usdValue = new USD(6);

        EUR newValue = exchangeDesk.exchange(ronValue, EUR.class, (float) (1/4.8));
        System.out.println("Exchange result:" + newValue.getValue());
    }
}
