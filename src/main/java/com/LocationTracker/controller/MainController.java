package com.LocationTracker.controller;


import com.LocationTracker.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/location")
public class MainController {

    @Autowired
    LocationService service;

    @RequestMapping(path="/addLocation/{latitude}/{longitude}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    void addLocation(@PathVariable String latitude, @PathVariable String longitude){

        service.addLocation();
    }

}
