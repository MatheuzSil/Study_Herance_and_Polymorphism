package Exercises.entities.exercise03;

import Exercises.entities.exercise03.enums.Color;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


    @Override
    public double area(){
        return height * width;
    }
}
