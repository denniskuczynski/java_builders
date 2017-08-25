package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExampleModel {
    @JsonProperty("name")
    private final String _name;

    @JsonProperty("favoriteNumbers")
    private List<Integer> _favoriteNumbers;
}