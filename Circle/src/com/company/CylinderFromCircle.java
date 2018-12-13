package com.company;
import com.company.Circle;
public class CylinderFromCircle extends Circle {
    private double height;

    public CylinderFromCircle(){
        super();
        this.height=1.0;

    }
    public CylinderFromCircle(double r)
    {
        super(r);
        this.height=height;
    }
    public CylinderFromCircle(double r, double h)
    {
        super(r);
        this.height=height;
    }
    public CylinderFromCircle(double r, double h, String c)
    {
        super(r, c);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}


