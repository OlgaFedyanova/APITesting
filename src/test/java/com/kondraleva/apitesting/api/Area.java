package com.kondraleva.apitesting.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Area {
    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("DistrictId")
    public Integer districtId;
    @JsonProperty("CountryId")
    public Integer countryId;
    @JsonProperty("OraId")
    public Integer oraId;
}
