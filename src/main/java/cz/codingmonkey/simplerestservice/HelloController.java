package cz.codingmonkey.simplerestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    Mono<String> sayHello() {
        return Mono.just("Hello world!");
    }
}
