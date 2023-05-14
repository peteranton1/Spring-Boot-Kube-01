package com.example.SpringBootKube01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootKube01Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootKube01Application.class, args);
  }

  @Bean
  public RouterFunction<ServerResponse> routes(DemoProperties properties) {
    return route()
      .GET("/",
        request -> ServerResponse
          .ok()
          .body(
            Mono.just(
              properties.getMessage()
            ),
            String.class
          )
      ).build();
  }
}
