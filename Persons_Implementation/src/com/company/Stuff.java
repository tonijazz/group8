package com.company;

import com.company.Person;

public class Stuff extends Person {

    private String school;
    private double pay;

    public Stuff(String name, String adress, String school, double pay)
    {
        super(name, adress);
    }


    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {

    }
    public double getPay()
    {
        return pay;
    }

    public void setPay(double pay)
    {

    }

    public String toString()
    { String p;
        p= Double.toString(getPay());
        return "staff[person[name=" + getName() + " ,adress= " + getAdress() + ",school= "  + getSchool() + ",pay " + p + "]";
    }

}


