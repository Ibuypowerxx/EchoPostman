package ru.netology;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class TestApi {
    @Test
    void shouldReturnAcc() {

        given()
                .baseUri("https://postman-echo.com")
                .body("HelloWorld") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data",org.hamcrest.Matchers.equalTo("Hell"))
        ;
    }
}
