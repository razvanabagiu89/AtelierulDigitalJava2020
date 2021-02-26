package lab9.ch5;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        Flux<String> flux1 = ch5.createFlux(ch5.words1);
        Flux<String> flux2 = ch5.createFlux(ch5.words2);
        Flux<String> newFlux = ch5.mergeFluxWithNoInterleave(flux1, flux2);
        newFlux.subscribe(System.out::println);
        System.out.println("------");

        newFlux = ch5.mergeFluxWithInterleave(flux1, flux2);
        newFlux.subscribe(System.out::println);
        System.out.println("------");

        Mono<String> mono1 = Mono.just("My name is ");
        Mono<String> mono2 = Mono.just("Razvan");
        newFlux = ch5.createFluxFromMultipleMono(mono1, mono2);
        newFlux.subscribe(System.out::print);
    }
}
