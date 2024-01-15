package com.workintech.s14d1;

public class Cylinder extends Circle  {
    private double height;


    private double newHeight(double height){
        if(height<0){
            return 0;
        } else {
            return height;
        }
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = newHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
