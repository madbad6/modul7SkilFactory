package com.madbad;

public class Car extends Machinery{
    private String name;
    public Car(String fuelType, String name) {
        super(fuelType);
        this.name =name;
    }

    @Override
    public String toDo() {
        return name + " Rides on the ground and it is working " + getFuelType();
    }

    @Override
    public String toString() {
        return toDo();
    }
}
