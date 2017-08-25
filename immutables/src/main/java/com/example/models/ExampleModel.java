package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

import java.util.List;


@Value.Immutable
public abstract class ExampleModel {
    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("favoriteNumbers")
    public abstract List<Integer> favoriteNumbers();
}
