package com.example.springconsumingrest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)     // any properties not bound in this type should be ignored.
// lombok
@Data
@NoArgsConstructor
public class Quote {

    // variable names must match key of JSON from API
    private String type;
    private Value value;

}
