package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.modal.BankAccount;
import com.sample.graphql.modal.Currency;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        return BankAccount.builder().id(id).currency(Currency.CH).name("sinco").build();
    }
}
