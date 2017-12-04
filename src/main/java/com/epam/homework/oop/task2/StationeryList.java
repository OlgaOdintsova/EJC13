package com.epam.homework.oop.task2;

import java.util.ArrayList;
import java.util.List;

public class StationeryList implements CountAbility{

    private List<Stationery> list = new ArrayList<>();

    public void add(Stationery stationery){
        list.add(stationery);
    }

    @Override
    public int getPrice() {
        int sumOfStationery = 0;

        for (Stationery stationery : list) {
            sumOfStationery += stationery.getPrice();
        }

        return sumOfStationery;
    }

    public void addAll(List<Stationery> stationeryList) {
        list.addAll(stationeryList);
    }

}
