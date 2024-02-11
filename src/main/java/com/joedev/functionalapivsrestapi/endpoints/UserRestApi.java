package com.joedev.functionalapivsrestapi.endpoints;

import com.joedev.functionalapivsrestapi.User;
import com.joedev.functionalapivsrestapi.UserHandler;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/rest")
public class UserRestApi {

    private final UserHandler userHandler;

    public UserRestApi(UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    @GetMapping("/users")
    public Flux<User> listUsers() {
        return userHandler.listUsers();
    }

    @GetMapping("/user")
    public Mono<User> getUser(@RequestParam Long userId) {
        return userHandler.getUser(userId);
    }

}
