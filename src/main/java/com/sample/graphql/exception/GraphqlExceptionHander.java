package com.sample.graphql.exception;

import com.oembedler.moon.graphql.boot.error.ThrowableGraphQLError;
import graphql.GraphQLException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class GraphqlExceptionHander {
    @ExceptionHandler(GraphQLException.class)
    public ThrowableGraphQLError handle(GraphQLException graphQLException) {
        return new ThrowableGraphQLError(graphQLException);
    }
    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handle(RuntimeException runtimeException) {
        return new ThrowableGraphQLError(runtimeException, "internal error");
    }
}
