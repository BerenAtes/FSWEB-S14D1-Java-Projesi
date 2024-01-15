package com.workintech.s14d1;

public class Circle {
    private double radius;

    private double newRadius(double radius){
        if(radius<0){
           return 0;
        }else {
            return radius;
        }
    }

    public Circle(double radius) {
        this.radius = newRadius(radius);

    }

    public double getRadius() {
        return radius;
    }


    public double getArea(){
        return radius * radius * Math.PI;
    }
}
