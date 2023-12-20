package com.company.courier;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static com.company.Constants.*;


public class CourierSteps extends BaseClient{
    @Step("Регистрация нового курьера")
    public ValidatableResponse createCourier(CourierModel courierModel) {
        return requestSpec()
                .body(courierModel)
                .when()
                .post(COURIER_POST_CREATE)
                .then();
    }

    @Step("Авторизация курьера")
    public ValidatableResponse loginCourier(CourierCreds courierCreds) {
        return requestSpec()
                .body(courierCreds)
                .when()
                .post(COURIER_POST_LOGIN)
                .then();
    }

    @Step("Удаление курьера")
    public ValidatableResponse deleteCourier(int courierId) {
        return requestSpec()
                .when()
                .delete(COURIER_DELETE + courierId)
                .then();
    }
}