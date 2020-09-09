package com.viktor;

import org.apache.log4j.Logger;

abstract class Shape {

    protected String figureName;
    protected double a;
    protected double b;
    protected static final Logger LOG = Logger.getLogger("Shape");

    Shape(String figureName, double a, double b) {
        this.figureName = figureName;
        this.a = a;
        this.b = b;
    }

    public abstract double getSquare();
    public abstract double getPerimeter();
}
