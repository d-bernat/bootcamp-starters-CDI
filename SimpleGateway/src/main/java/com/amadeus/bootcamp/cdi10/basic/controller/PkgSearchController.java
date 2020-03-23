package com.amadeus.bootcamp.cdi10.basic.controller;

import com.amadeus.bootcamp.cdi10.basic.logger.Logger;
import com.amadeus.bootcamp.cdi10.basic.service.PkgSearchService;

public class PkgSearchController {
    public String search(String request){
        Logger logger = new Logger();
        logger.log(this, request);
        PkgSearchService pkgSearchService = new PkgSearchService();
        return pkgSearchService.execute(request);
    }
}
