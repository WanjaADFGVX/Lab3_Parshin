package ru.mirea.lab3;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.width = 10;
        this.length = 5;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, area: " + getArea() + ", color: "+this.color
                + ", perimeter: " + getPerimeter();
    }

}
