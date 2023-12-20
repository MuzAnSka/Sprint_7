package com.company.courier;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static com.company.Constants.BASE_URL;
import static io.restassured.RestAssured.given;

public class BaseClient {
    public static RequestSpecification requestSpec() {
        return given().log().all()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL);
    }
}
