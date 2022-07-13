package com.kondraleva.apitesting.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class District {
    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("OraId")
    public Integer oraId;
    @JsonProperty("Cities")
    public Object cities;
    @JsonProperty("CountryId")
    public Integer countryId;
    @JsonProperty("OraParishId")
    public Integer oraParishId;
}
