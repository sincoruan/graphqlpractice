package com.sample.graphql.resolvers.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sample.graphql.modal.BankAccount;
import com.sample.graphql.modal.Currency;
import com.sample.graphql.modal.input.CreateBankAccountInput;
import graphql.schema.DataFetchingEnvironment;
import org.intellij.lang.annotations.JdkConstants;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.UUID;

@Component
@Validated
public class BankAccountMutation implements GraphQLMutationResolver {
    public BankAccount createBankAccount(@Valid CreateBankAccountInput createBankAccountInput, DataFetchingEnvironment e) {
        return BankAccount.builder().id(UUID.randomUUID()).currency(Currency.CH).createdOn(LocalDate.now()).createdTime(ZonedDateTime.now()).build();
    }
}
