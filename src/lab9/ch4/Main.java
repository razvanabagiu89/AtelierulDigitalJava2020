package lab9.ch4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        User user0 = new User("Razvan", "Abagiu", "razvanab");
        Mono<User> mono = Mono.just(user0);
        Mono<User> newMono = ch4.capitalizeOne(mono);

        newMono.map(User::getFirstName).subscribe(System.out::println);
        User user1 = new User("Alex", "Popescu", "alexpop93");
        User user2 = new User("Andreea", "Tanase", "aaaaa1");

        Flux<User> flux = Flux.just(user0, user1, user2);
        ch4.asyncCapitalizeMany(flux);
    }
}
