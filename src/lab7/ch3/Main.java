package lab7.ch3;

public class Main {
    public static void main(String[] args) {

        /*
        We know that rock beats scissors
        paper beats rock
        scissors beats paper
         */

        Player mike = new Player("Mike");
        Player john = new Player("John");

        mike.run();
        john.run();

        String mikeOption = mike.getCurrentChoice();
        String johnOption = john.getCurrentChoice();
        System.out.println(mike.getPlayerName() + " chose: " + mikeOption);
        System.out.println(john.getPlayerName() + " chose: " + johnOption);
        System.out.println("----- Fight -----");

        if(mikeOption.equals("rock")) {
            if(johnOption.equals("paper")) {
                System.out.println(john.getPlayerName() + " is the winner !");
            }
            else if(johnOption.equals("scissors")) {
                System.out.println(mike.getPlayerName() + " is the winner !");
            }
            else {
                System.out.println("It's a tie ");
            }
        }
        else if(mikeOption.equals("paper")) {
            if(johnOption.equals("scissors")) {
                System.out.println(john.getPlayerName() + " is the winner !");
            }
            else if(johnOption.equals("rock")) {
                System.out.println(mike.getPlayerName() + " is the winner !");
            }
            else {
                System.out.println("It's a tie ");
            }
        }
        else if(mikeOption.equals("scissors")){
            if(johnOption.equals("rock")) {
                System.out.println(john.getPlayerName() + " is the winner !");
            }
            else if(johnOption.equals("paper")) {
                System.out.println(mike.getPlayerName() + " is the winner !");
            }
            else {
                System.out.println("It's a tie ");
            }
        }
    }
}
