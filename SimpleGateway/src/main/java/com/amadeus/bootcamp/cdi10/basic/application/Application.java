package com.amadeus.bootcamp.cdi10.basic.application;

import com.amadeus.bootcamp.cdi10.basic.controller.PkgSearchController;
import com.amadeus.bootcamp.cdi10.basic.logger.Logger;

public class Application {

    public String search(String request){
        Logger logger = new Logger();
        logger.log(this, request);
        PkgSearchController pkgSearchController = new PkgSearchController();
        return pkgSearchController.search(request);
    }
}
