package com.example.resources;

import com.example.models.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ExampleModel getExampleModel() {
        return ExampleModel.builder()._name("Hello World").build();
    }
}
