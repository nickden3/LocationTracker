package com.LocationTracker.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Locations")
public class LocationData {
    @Id
    public String id;

    public long latitude;
    public long longitude;

    public LocationData() {}


}
