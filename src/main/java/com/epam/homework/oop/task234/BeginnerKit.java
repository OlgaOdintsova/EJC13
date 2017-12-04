package com.epam.homework.oop.task234;

import java.util.Arrays;
import java.util.List;

public class BeginnerKit extends StationeryList {
    private List<Stationery> beginnerList = Arrays.asList(
            new Pen(10, "blue"),
            new Notebook(15),
            new Rubber(20));

    public void add(Stationery stationery) {
        throw new UnsupportedOperationException();
    }

    public List<Stationery> getBeginnerList() {
        return beginnerList;
    }

}
