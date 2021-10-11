package com.madbad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Object> list = new ArrayList<>();
        list.add(new Car("Gas", "Car"));
        list.add(new Plane("Kerosene", "Plane"));
        list.add(new Generator("Diesel", "Generator"));
        list.add(new Horse("Horse"));

        list.forEach(System.out::println);
    }
}
