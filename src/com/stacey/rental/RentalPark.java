package com.stacey.rental;

import com.stacey.rental.vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class RentalPark {
    public static void main(String[] args) {
        new RentalPark().run();
    }

    private InfoDesk infoDesk;

    private void run() {
        initializeInfoDesk();
        //int distance = 5; // km
        int distance = 25; // km

        System.out.println("id=1, time: " + infoDesk.getTime(1, distance)+" minutes");
        System.out.println("id=2, time: " + infoDesk.getTime(2, distance)+" minutes");
        System.out.println("id=3, time: " + infoDesk.getTime(3, distance)+" minutes");

        System.out.println("id=1, price: " + infoDesk.getPrice(1, distance)+" uah");
        System.out.println("id=2, price: " + infoDesk.getPrice(2, distance)+" uah");
        System.out.println("id=3, price: " + infoDesk.getPrice(3, distance)+" uah");
    }

    private void initializeInfoDesk() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(1, 60, 400));
        vehicles.add(new Bike(2, 20, 100));
        vehicles.add(new Cart(3, 10, 800));
        infoDesk = new InfoDesk(vehicles);
    }
}
