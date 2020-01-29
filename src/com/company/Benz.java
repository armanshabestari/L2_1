package com.company;

public class Benz {
    String model;
    int year;
    int displacement;
    int power;
    int topspeed;
    double fuel;

    Benz(String model,int year,int displacement,int power,int topspeed,double fuel){
        this.model=model;
        this.year=year;
        this.displacement=displacement;
        this.power=power;
        this.topspeed=topspeed;
        this.fuel=fuel;
    }

    public void display(){
        System.out.println(model);
        System.out.println(year);
        System.out.println(displacement);
        System.out.println(power);
        System.out.println(topspeed);
        System.out.println(fuel);
    }

}
