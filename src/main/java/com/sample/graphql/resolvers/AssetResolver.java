package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sample.graphql.modal.Assets;
import com.sample.graphql.modal.BankAccount;
import org.apache.commons.lang3.concurrent.Computable;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class AssetResolver implements GraphQLResolver<BankAccount> {
    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public CompletableFuture<Assets> assets(BankAccount bankAccount) {
        return CompletableFuture.supplyAsync(
            () ->  {
                return Assets.builder().id("001").os("windows").build();
            },
            executorService);
    }
}
