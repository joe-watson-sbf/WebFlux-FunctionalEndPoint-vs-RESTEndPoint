package com.joedev.functionalapivsrestapi.endpoints;

import com.joedev.functionalapivsrestapi.User;
import com.joedev.functionalapivsrestapi.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Objects;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FunctionalEndpoint {

    @Bean
    public RouterFunction<ServerResponse> routes(UserHandler userHandler) {
        return route(GET("/api/functional/users")
                .and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(userHandler.listUsers(), User.class))
        );
    }

    @Bean
    public RouterFunction<ServerResponse> getUser(UserHandler userHandler) {
        return route(GET("/api/functional/user")
                .and(accept(MediaType.APPLICATION_JSON))
                .and(queryParam("userId", Objects::nonNull)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(userHandler.getUser(Long.valueOf(request.queryParam("userId").get())), User.class))
        );
    }
}
