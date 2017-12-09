package com.epam.homework.oop.task234;

import com.epam.homework.oop.task234.ability.CountAbility;
import com.epam.homework.oop.task234.stationery.Stationery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StationeryList implements CountAbility {

    private List<Stationery> list = new ArrayList<>();

    public void add(Stationery stationery){
        list.add(stationery);
        System.out.println("You added a one of stationary.");
    }

    @Override
    public int getPrice() {
        int sumOfStationery = 0;

        for (Stationery stationery : list) {
            sumOfStationery += stationery.getPrice();
        }

        return sumOfStationery;
    }

    void addAll(List<Stationery> stationeryList) {
        list.addAll(stationeryList);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    void sortByPrice() {
        list.sort(null);
    }

    void sortByName() {
        Comparator<Stationery> comparator = new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.getShortName().compareTo(o2.getShortName());
            }
        };
        list.sort(comparator);
    }

    void sortByPriceName() {
        list.sort(null);
        Comparator<Stationery> comparator = (o1, o2) -> o1.getShortName().compareTo(o2.getShortName());
        list.sort(comparator);
    }
}
