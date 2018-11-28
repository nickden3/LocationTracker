package com.LocationTracker.service;
import com.LocationTracker.repository.RepositoryMongo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private static final Logger S_LOG = LogManager.getLogger(LocationService.class);

    @Autowired
    RepositoryMongo mongo;


    public void addLocation(double latitude, double longitude){
        mongo.addLocation(latitude, longitude);
    }

    public void test(){
        mongo.addLocation(37.8667, -122.5);
    }
}
