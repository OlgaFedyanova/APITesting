package com.kondraleva.apitesting.api;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static io.restassured.RestAssured.given;

public class RegressTest {

    private static final String URL = "https://kz.siberianwellness.com/api/v1/city?CountryId=0&IsIgnoreGeo=false&IsCityHasCSC=false&IsShowOnMap=false&RegionId=22&Search=&Order[]=MajorOrder&Order[]=Name&OrderDirection=abs&PerPage=50&CurrentPage=1&LanguageId=9&UserTimeZone=7&CityId=272";
    private static final String TOKEN = "bfd2fe14-6d3b-470f-ae97-2e6c8c23cf7f";
    java.util.List<List> cities;

    @Test
    public void checkNameCityTest() {
        cities = given()
                .header("Content-type", "multipart/form-data")
                .header("token", TOKEN)
                .and()
                .when()
                .contentType(ContentType.JSON)
                .get(URL)
                .then().log().all()
                .extract().body().jsonPath().getList("List", List.class);
        String city = String.valueOf(Objects.requireNonNull(cities.stream().filter(c -> c.getName().equals("Алматы"))
                .findAny().orElse(null)).name);

        Assert.assertEquals("Алматы", city);
    }

    @Test
    public void checkCountryIdTest() {
        cities = given()
                .header("Content-type", "multipart/form-data")
                .header("token", TOKEN)
                .and()
                .when()
                .contentType(ContentType.JSON)
                .get(URL)
                .then().log().all()
                .extract().body().jsonPath().getList("Area", List.class);
        Assert.assertTrue(cities.stream().allMatch(c -> c.getCountryId().toString().contains("21")));
    }

}
