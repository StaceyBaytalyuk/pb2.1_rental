package com.stacey.rental.vehicles;

public abstract class Vehicle {
    protected int id;
    protected int speed; // km/hour
    protected int price; // uah

    public Vehicle(int id, int speed, int price) {
        this.id = id;
        this.speed = speed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }
}
