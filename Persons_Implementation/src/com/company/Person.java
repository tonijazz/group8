package com.company;
public class Person {


    private String name;
    private String adress;
    public static void main(String[] args)
    {


    }

    public Person(String name, String adress)
    {


    }
    public String getName()
    {return name;}

    public String getAdress()
    { return adress;}

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public String toString()
    {
        return "[person name:" + getName() +",adress " + getAdress() + "]";

    }
}
