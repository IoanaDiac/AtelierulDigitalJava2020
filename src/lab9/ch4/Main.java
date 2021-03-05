package lab9.ch4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("A", "Z", "az"),
                new User("B", "Y", "by"),
                new User("C", "X", "cx"),
                new User("D", "W", "dw")
        );

        System.out.printf("Capitalize one%n");
        capitalizeOne(Mono.just(users.get(0))).subscribe(System.out::println);

        System.out.printf("%nCapitalize many%n");
        capitalizeMany(Flux.fromIterable(users)).subscribe(System.out::println);

        System.out.printf("%nCapitalize many asynchronous%n");
        asyncCapitalizeMany(Flux.fromIterable(users)).subscribe(System.out::println);
    }

    static Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(user -> new User(user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getUsername().toUpperCase()));
    }

    static Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.flatMap(user -> capitalizeOne(Mono.just(user)));
    }

    static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        return flux.flatMap(Main::asyncCapitalizeUser);
    }

    static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(u.getFirstName().toUpperCase(), u.getLastName().toUpperCase(), u.getUsername().toUpperCase()));
    }
}
