package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.modal.BankAccount;
import com.sample.graphql.modal.Client;
import com.sample.graphql.modal.Currency;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        Client clientA = Client.builder().firstName("A").lastName("clientA").build();
        Client clientB = Client.builder().firstName("B").lastName("clientB").build();
        clientA.setClient(clientB);
        clientB.setClient(clientA);
        return BankAccount.builder().id(id).currency(Currency.CH).client(clientA).build();
    }
}
