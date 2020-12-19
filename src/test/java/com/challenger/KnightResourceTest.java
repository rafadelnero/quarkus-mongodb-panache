package com.challenger;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class KnightResourceTest {

    @Test
    public void testKnightCreationEndpoint() {
        with()
            .contentType(ContentType.JSON)
            .body(new Knight("TestKnight", "TestSword"))
            .when()
            .post("/knights")
            .then()
            .statusCode(201);
    }

    @Test
    public void testKnightGetAllEndpoint() {
        given()
            .when().get("/knights")
            .then()
            .statusCode(200);
    }

    /**
     * It's necessary to put an id that is existent, otherwise the test will fail.
     */
    // @Test
    public void testDeleteKnightEndpoint() {
        given()
            .header("Content-type", "application/json")
            .when()
            .delete("/knights/5fdcc4609af7fa401315ada2")
            .then()
            .statusCode(204);
    }

}