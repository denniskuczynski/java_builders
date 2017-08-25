package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExampleModel {
    @JsonProperty("name")
    private final String _name;
}