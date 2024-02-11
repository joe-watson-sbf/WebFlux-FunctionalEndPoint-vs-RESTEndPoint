package com.joedev.functionalapivsrestapi;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class UserHandler {

    public Flux<User> listUsers() {
        return Fakedata.listUsers()
                .delayElements(Duration.ofSeconds(1));
    }
    public Mono<User> getUser(Long id) {
        return Fakedata.listUsers().filter(user -> user.id().equals(id)).next();
    }

}
