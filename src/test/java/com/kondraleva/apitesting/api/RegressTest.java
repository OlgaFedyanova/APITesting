package com.kondraleva.apitesting.api;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegressTest {

    private static final String URL = "https://kz.siberianwellness.com/kz-ru/";
    List<CityDataModel> cities;

    @Test
    public void checkNameCityTest() {
        cities = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/v1")
                .then().log().all()
                .extract().body().jsonPath().getList("data", CityDataModel.class);
        String city = String.valueOf(cities.stream().filter(c -> c.getNameCity().equals("Almaty"))
                .findAny().orElse(null));
        Assert.assertEquals("Almaty", city);
    }

    @Test
    public void checkCountryIdTest() {
        cities = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/v1")
                .then().log().all()
                .extract().body().jsonPath().getList("data", CityDataModel.class);
        Assert.assertTrue(cities.stream().allMatch(c -> c.getCountryId().toString().contains("21")));
    }
}
