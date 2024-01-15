package com.workintech.s14d1;

public class Cuboid extends Rectangle {
    private double height;

    private double newHeight(double height){
        if(height<0){
            return 0;
        }else{
            return height;
        }
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = newHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
