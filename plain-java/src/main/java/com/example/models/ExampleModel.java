package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class ExampleModel {
    @JsonProperty("name")
    private String _name;

    @JsonProperty("favoriteNumbers")
    private List<Integer> _favoriteNumbers;

    protected ExampleModel(final Builder pBuilder) {
        _name = pBuilder._name;
        _favoriteNumbers = pBuilder._favoriteNumbers;
    }

    public String getName() {
        return _name;
    }

    public List<Integer> getFavoriteNumbers() {
        return _favoriteNumbers;
    }

    public int hashCode() {
        return Objects.hash(getName(), getFavoriteNumbers());
    }

    public boolean equals(final Object pObj) {
        if (!(pObj instanceof ExampleModel)) {
            return false;
        }

        final ExampleModel other = (ExampleModel)pObj;
        return Objects.equals(getName(), pObj.getName()) &&
               Objects.equals(getFavoriteNumbers(), pObj.getFavoriteNumbers());

    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        protected String _name;
        protected List<Integer> _favoriteNumbers;

        public Builder name(final String pName) {
            _name = pName;
            return this;
        }

        public Builder favoriteNumbers(final List<Integer> pFavoriteNumbers) {
            _favoriteNumbers = pFavoriteNumbers;
            return this;
        }

        public ExampleModel build() {
            return new ExampleModel(this);
        }
    }
}
