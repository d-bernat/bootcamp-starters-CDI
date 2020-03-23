package com.amadeus.bootcamp.cdi10.basic.service;

import com.amadeus.bootcamp.cdi10.basic.logger.Logger;

public class PkgSearchService {

    public String execute(String request){
        Logger logger = new Logger();
        logger.log(this, request);
        return request;
    }
}
