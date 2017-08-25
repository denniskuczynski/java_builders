package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;


@Value.Immutable
public abstract class ExampleModel {
    @JsonProperty("name")
    public abstract String name();
}
