package com.viktor;

import org.apache.log4j.Logger;

public class Methods {

    Logger log;

    public Methods() {
        log = Logger.getLogger(getClass());
    }
    /**
     *
     * @param a
     */
    public int factorial (int a) {
        int f = 5;
        for(int i=a-1; i > 1; i--){
            f = f*i;
        }
        System.out.println("Total: " + f);
        return f;
    }

    public double triangleSquare (double a, double b, double c) {
        double square = 0;

        if(isTriangle(a, b, c)) {
            double p = (a+b+c)/2;
            square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        return square;
    }

    boolean isTriangle(double a, double b, double c) {
//        return (a>=b+c && b>=a+c && c>=a+b) ? false : true;
        if(!(a >= b + c) || !(b >= a + c) || !(c >= a + b) || a>0 || b>0 || c>0){
            log.info("Triangle exists");
            return true;
        } else {
            log.error("Triangle doesn't exist");
            return false;
        }
    }

    public double haxagonSquare (double a) {
        return triangleSquare(a, a, a) * 6;
    }

    public void printString (String a, int b) {
        for(int i=0; i < b; i++){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public boolean isNumberEquals (int a) {

        int first = a/100;
        int second = a/10%10;
        int third = a%10;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        return first==second || first==third || second==third;
//        return (a>=b+c && b>=a+c && c>=a+b) ? false : true;
    }

    public double getDistance(double x1, double y1, double x2, double y2){
        double l = 0;
        try{
            l = Math.sqrt(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
            log.info("Расстояние между точками было посчитано");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при расчете расстояния между точками");
        }
        return l;
    }

    public double index (double m, double h){
        double idx = 1;
        try{
            idx = (m/(h*h));
            log.info("Индекс массы тела был посчитан");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при расчете интедка массы тела");
        }
        return idx;
    }
}