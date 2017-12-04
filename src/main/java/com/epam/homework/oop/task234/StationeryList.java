package com.epam.homework.oop.task234;

import com.epam.homework.oop.task234.ability.CountAbility;
import com.epam.homework.oop.task234.stationery.Stationery;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StationeryList implements CountAbility {

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

    @Override
    public String toString() {
        return list.toString();
    }
}
