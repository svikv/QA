package com.viktor;

public class Triangle extends Shape {

    private double c;

    Triangle (String figureName, double a, double b, double c) {
        super(figureName, a, b);
        this.c = c;
    }

    public double getSquare () {
        double square = 0;

        if(isTriangle(a, b, c)) {
            double p = (a+b+c)/2;
            square = Math.sqrt(p*(p-super.a)*(p-super.b)*(p-c));
            LOG.info(figureName + "'s square calculated succesfully");
        }
        return square;
    }

    public double getPerimeter() {
        double perim = 0;

        if(isTriangle(a, b, c)) {
            perim = (a + b + c);
            LOG.info(figureName + "'s perimeter calculated succesfully");
        }
        return perim;
    }

    private boolean isTriangle(double a, double b, double c) {
        if(a < b + c && b < a + c && c < a + b){
            LOG.info(figureName + " exists");
            return true;
        } else {
            LOG.error(figureName + " doesn't exist");
            return false;
            }
        }
}