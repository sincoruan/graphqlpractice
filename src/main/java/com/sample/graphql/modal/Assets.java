package com.sample.graphql.modal;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Assets {
    String id;
    String os;
}
