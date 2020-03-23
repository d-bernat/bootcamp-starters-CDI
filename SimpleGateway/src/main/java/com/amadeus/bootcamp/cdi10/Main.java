package com.amadeus.bootcamp.cdi10;

import com.amadeus.bootcamp.cdi10.basic.application.Application;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to crash course CDI part 10");
        Application app = new Application();
        System.out.println(app.search("CGN"));

    }
}
