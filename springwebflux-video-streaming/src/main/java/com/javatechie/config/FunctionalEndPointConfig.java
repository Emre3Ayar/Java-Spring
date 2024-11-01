package com.javatechie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.javatechie.service.StreamingService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Configuration
@RequiredArgsConstructor
public class FunctionalEndPointConfig {
	
	private final StreamingService streamingService = new StreamingService();
	
    @Bean
    public RouterFunction<ServerResponse> router() {
        return RouterFunctions.route()
                .GET("/video/{title}", this::videoHandler)
                .build();
    }

    private Mono<ServerResponse> videoHandler(ServerRequest serverRequest) {
        String title = serverRequest.pathVariable("title");
        return ServerResponse.ok()
                .contentType(MediaType.valueOf("video/mp4"))
                .body(this.streamingService.getVideo(title), Resource.class);
    }
}
