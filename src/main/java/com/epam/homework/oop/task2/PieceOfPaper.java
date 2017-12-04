package com.epam.homework.oop.task2;

public class PieceOfPaper extends Stationery implements PaperAbility {

    public PieceOfPaper(int price) {
        super(price);
    }

    @Override
    public void mark(){System.out.println("You can write on this thing");}
}
