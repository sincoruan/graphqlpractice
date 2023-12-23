package com.sample.graphql.modal;


import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.Value;

import java.util.UUID;

@Builder
@Setter
public class BankAccount {
    UUID id;
    Client client;
    Currency currency;
}
