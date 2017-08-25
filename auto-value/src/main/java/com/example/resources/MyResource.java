package com.example.resources;

import com.example.models.*;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ExampleModel getExampleModel() {
        return ExampleModel.builder()
            .setName("Hello World")
            .setFavoriteNumbers(Arrays.asList(1))
            .build();
    }
}
