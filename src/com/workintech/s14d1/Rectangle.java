package com.workintech.s14d1;

public class Rectangle {
    private double width;
    private double length;

    private double newWidth(double width){
        if(width<0){
            return 0;
        } else {
            return width;
        }
    }

    private double newLength(double length){
        if(length<0){
            return 0;
        }else {
            return length;
        }
    }

    public Rectangle(double width, double length) {
        this.width = newWidth(width);
        this.length = newLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width*length;
    }
}
