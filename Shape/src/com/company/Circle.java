package com.company;
public class Circle extends Shape {

    private double radius=1.0;
    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle ( double radius, String color, Boolean filled)
    {

    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius()
    {

    }
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }
    public String toString()
    {
        String r;
        r=Double.toString(getRadius());
        return"(" + r + ")";
    }
}

