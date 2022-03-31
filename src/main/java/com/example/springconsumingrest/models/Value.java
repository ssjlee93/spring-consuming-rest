package com.example.springconsumingrest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)     // any properties not bound in this type should be ignored.

//lombok
@Data
@NoArgsConstructor
public class Value {
    private Long id;
    private String quote;
}
