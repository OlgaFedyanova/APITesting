package com.kondraleva.apitesting.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class List {
        @JsonProperty("Id")
        public Integer id;
        @JsonProperty("Name")
        public String name;
        @JsonProperty("CountryId")
        public Integer countryId;
        @JsonProperty("OraId")
        public Integer oraId;
        @JsonProperty("DistrictId")
        public Integer districtId;
        @JsonProperty("Lat")
        public Double lat;
        @JsonProperty("Long")
        public Double Long;
        @JsonProperty("GoogleGeoId")
        public String googleGeoId;
        @JsonProperty("TimezoneId")
        public Integer timezoneId;
        @JsonProperty("AreaId")
        public Integer areaId;
        @JsonProperty("District")
        public District district;
        @JsonProperty("Area")
        public Area area;
        @JsonProperty("IsShowArea")
        public boolean isShowArea;
        @JsonProperty("StoreId")
        public Integer storeId;
        @JsonProperty("DeliveryPointsNumber")
        public Integer deliveryPointsNumber;
        @JsonProperty("MajorOrder")
        public Object majorOrder;


}
