package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sample.graphql.modal.BankAccount;
import com.sample.graphql.modal.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
    public Client client(BankAccount bankAccount) {
        return Client.builder().firstName("sinco").lastName("ruan11").build();
    }
}
