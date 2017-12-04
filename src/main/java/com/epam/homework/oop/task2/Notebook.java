package com.epam.homework.oop.task2;

public class Notebook extends PieceOfPaper {

    public Notebook(int price) {
        super(price);
    }

    @Override
    public void mark() {
        System.out.println("It's a notebook");
    }
}
