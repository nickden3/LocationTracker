package com.LocationTracker.repository;

import com.LocationTracker.domain.LocationData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class RepositoryMongo {

    private static final Logger S_LOG = LogManager.getLogger(RepositoryMongo.class);

    @Autowired
    MongoTemplate m_template;

    MongoOperations m_ops;

    @PostConstruct
    public void initInstance(){
        m_ops = m_template;
    }

    public void addLocation(double latitude, double longitude){
        LocationData  data = new LocationData();
        data.setLatitude(latitude);
        data.setLongitude(longitude);
        data.setLocation(new GeoJsonPoint(latitude,longitude));
        data.setDateTaken(new Date());
        S_LOG.info("Saving location document");
        m_ops.save(data);

    }
}
