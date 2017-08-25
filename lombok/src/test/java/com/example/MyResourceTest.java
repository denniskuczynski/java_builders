package com.example;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.example.resources.MyResource;

public class MyResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(MyResource.class);
    }

    @Test
    public void testGetExampleModel() {
        final String responseMsg = target().path("myresource").request().get(String.class);

        assertEquals("{\"name\":\"Hello World\"}", responseMsg);
    }
}
