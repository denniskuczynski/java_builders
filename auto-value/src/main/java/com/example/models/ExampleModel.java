package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ExampleModel {
    @JsonProperty("name")
    public abstract String name();

    public static Builder builder() {
        return new AutoValue_ExampleModel.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setName(String value);
        public abstract ExampleModel build();
    }
}