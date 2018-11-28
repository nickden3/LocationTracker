package com.LocationTracker.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;

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
}
