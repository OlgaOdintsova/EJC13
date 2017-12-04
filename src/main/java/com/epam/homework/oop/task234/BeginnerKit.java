package com.epam.homework.oop.task234;

import com.epam.homework.oop.task234.stationery.*;

import java.util.Arrays;
import java.util.List;

public class BeginnerKit extends StationeryList {
    private List<Stationery> beginnerList = Arrays.asList(
            new Pen(10, "blue"),
            new Notebook(15),
            new Marker(20, "pink"));

    public void add(Stationery stationery) {
        throw new UnsupportedOperationException();
    }

    public List<Stationery> getBeginnerList() {
        return beginnerList;
    }

}
