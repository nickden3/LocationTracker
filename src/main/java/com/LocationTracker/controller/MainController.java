package com.LocationTracker.controller;


import com.LocationTracker.repository.RepositoryMongo;
import com.LocationTracker.service.LocationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/location")
public class MainController {

    private static final Logger S_LOG = LogManager.getLogger(MainController.class);

    @Autowired
    LocationService service;

    @RequestMapping(path="/addLocation/{latitude}/{longitude}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    void addLocation(@PathVariable double latitude, @PathVariable double longitude){

        service.addLocation(latitude, longitude);
    }

    @RequestMapping(path="/test", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    void addLocation(){
        service.test();
        S_LOG.info("TEST ENDPOINT");
    }

}
