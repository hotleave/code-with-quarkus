package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

// @QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        ExampleResource resource = new ExampleResource();
        String result = resource.hello();
        assertEquals("Js result: 2", result);
    }

}