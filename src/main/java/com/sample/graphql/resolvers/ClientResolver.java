package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sample.graphql.modal.BankAccount;
import com.sample.graphql.modal.Client;
import graphql.execution.DataFetcherResult;
import graphql.servlet.core.GenericGraphQLError;
import org.springframework.stereotype.Component;

@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
    public DataFetcherResult<Client> client(BankAccount bankAccount) {
        return DataFetcherResult.<Client>newResult()
                .data(Client.builder().firstName("sinco").lastName("ruan11").build())
                .error(new GenericGraphQLError("couldn't retrive client data"))
                .build();
    }
}
