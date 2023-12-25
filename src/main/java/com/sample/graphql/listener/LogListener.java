package com.sample.graphql.listener;

import graphql.servlet.core.GraphQLServletListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Duration;
import java.time.Instant;

@Slf4j
@Component
@RequiredArgsConstructor
public class LogListener implements GraphQLServletListener {
    @Override
    public RequestCallback onRequest(HttpServletRequest request, HttpServletResponse response) {
        Instant start = Instant.now();
        return new RequestCallback(){
            @Override
            public void onSuccess(HttpServletRequest request, HttpServletResponse response) {
            }

            @Override
            public void onError(HttpServletRequest request, HttpServletResponse response, Throwable throwable) {
            }

            @Override
            public void onFinally(HttpServletRequest request, HttpServletResponse response) {
                log.info("time cost: {}", Duration.between(start, Instant.now()));
            }
        };
    }
}
