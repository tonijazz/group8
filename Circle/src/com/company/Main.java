package com.company;

import com.company.Circle;

public class Main {

    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(35.5);
        CylinderFromCircle Cy1 = new CylinderFromCircle();
        System.out.println("Area is: "+C1.getArea());
        System.out.println("Area is: "+C2.getArea());
        System.out.println("Volume is: "+Cy1.getArea());
        System.out.println(C1.toString());

    }
}
