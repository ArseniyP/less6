package com.less6;

import java.time.LocalTime;

abstract public class Restaurant {
    protected String name;
    protected LocalTime startWork;
    protected LocalTime endWork;


    Restaurant() {
        name = "NoName";
    }

    Restaurant(String name) {
        this.name = name;
    }

    abstract public boolean hireWorker(String FIO);

    abstract public boolean fireWorker(String FIO);

    abstract public String getMenu();

    abstract public boolean isOpen();
}
