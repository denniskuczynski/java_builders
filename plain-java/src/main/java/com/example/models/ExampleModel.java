package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleModel {
    @JsonProperty("name")
    private String _name;

    public ExampleModel(final String pName) {
        _name = pName;
    }
}