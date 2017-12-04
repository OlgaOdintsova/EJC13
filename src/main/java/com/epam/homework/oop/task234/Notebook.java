package com.epam.homework.oop.task234;

public class Notebook extends PieceOfPaper {

    public Notebook(int price) {
        super(price);
    }

    @Override
    public void mark() {
        System.out.println("It's a notebook");
    }
}
