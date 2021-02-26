package lab9.ch1;

import reactor.core.publisher.Flux;

public class ch1 {
    public Flux<String> emptyFlux() {
        return Flux.empty();
    }

    public Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    public Flux<String> errorFlux() {
        return Flux.error(new Exception());
    }
}
