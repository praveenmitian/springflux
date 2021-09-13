package com.learning.springflux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SpringfluxApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void monoTest(){
		Mono<String> mono = Mono.just("Hello Praveen").log();
		mono.subscribe(System.out::println);
	}

	@Test
	public void fluxTest(){
		Flux<String> flux = Flux.just("Hello", "Praveen", "Are", "you", "there");
		flux.subscribe(System.out::println);
	}

}
