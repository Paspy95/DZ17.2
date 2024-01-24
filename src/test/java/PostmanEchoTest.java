import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void dataToBeSend() {
        var data = "2024";
        given()
                .baseUri("https://postman-echo.com")
                .body(2023)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(2023));
    }
}
