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

    @RequestMapping(path="/addLocation/{latitude}/{longitude}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    void addLocation(@PathVariable String latitude, @PathVariable String longitude){

        service.addLocation();
    }

    @RequestMapping(path="/test", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    void addLocation(){

        S_LOG.info("TEST ENDPOINT");
    }

}
