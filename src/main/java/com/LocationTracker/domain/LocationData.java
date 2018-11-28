package com.LocationTracker.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Locations")
public class LocationData {
    @Id
    public String id;

    private double latitude;
    private double longitude;

    private GeoJsonPoint location;
    private Date dateTaken;

    public LocationData() {}


}
