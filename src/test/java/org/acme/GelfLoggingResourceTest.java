package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GelfLoggingResourceTest {

    @Test
    public void log() {
        given()
          .when().get("/gelf-logging")
          .then()
             .statusCode(204);

    }

}