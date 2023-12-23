package com.sample.graphql.modal;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
public class Client {
    String firstName;
    List<String> middleName;
    String lastName;
    Client client;
}
