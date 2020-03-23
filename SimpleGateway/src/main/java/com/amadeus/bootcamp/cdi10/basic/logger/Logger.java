package com.amadeus.bootcamp.cdi10.basic.logger;

import java.time.LocalDateTime;

public class Logger {
    public void log(Object caller, String message){
        System.out.println(String.format("%s : %s: %s : %s",
                LocalDateTime.now(), Thread.currentThread().getName(), caller, message));
    }
}
