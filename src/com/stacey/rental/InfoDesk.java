package com.stacey.rental;

import com.stacey.rental.vehicles.Vehicle;

import java.util.List;

public class InfoDesk {
    private List<Vehicle> vehicles;

    public InfoDesk(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // returns minutes
    public int getTime(int idVehicle, int km) {
        Vehicle vehicle = findVehicleById(idVehicle);
        if ( vehicle != null ) {
            return (km * 60) / vehicle.getSpeed();
        }
        return -1;
    }

    // почасовая оплата. Например, 1:25 - платим за 2 часа
    public int getPrice(int idVehicle, int km) {
        Vehicle vehicle = findVehicleById(idVehicle);
        if ( vehicle != null ) {
            int hours = (int) Math.ceil((double) km / vehicle.getSpeed());
            return vehicle.getPrice()*hours;
        }
        return -1;
    }

    private Vehicle findVehicleById(int idVehicle) {
        if ( vehicles.stream().anyMatch(p -> p.getId() == idVehicle) ) {
            return vehicles.stream().filter(p -> p.getId() == idVehicle).findFirst().get();
        } else {
            return null;
        }
    }
}
