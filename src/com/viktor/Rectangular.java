package com.viktor;

public class Rectangular extends Shape {

    Rectangular (String figureName, double a, double b) {
        super(figureName, a, b);
    }

    public double getSquare () {
        double square = 0;

        if(isRectangular(a, b)) {
            square = a*b;
            LOG.info(figureName + "'s square calculated succesfully");
        }
        return square;
    }

    public double getPerimeter() {
        double perim = 0;

        if(isRectangular(a, b)) {
            perim = (a + b)*2;
            LOG.info(figureName + "'s perimeter calculated succesfully");
        }
        return perim;
    }

    private boolean isRectangular(double a, double b) {
        if(a > 0 && b >0 ){
            LOG.info(figureName + " exists");
            return true;
        } else {
            LOG.error(figureName + " doesn't exist");
            return false;
        }
    }
}