package com.epam.homework.oop.task234.stationery;

import com.epam.homework.oop.task234.ability.PaperAbility;

public abstract class PieceOfPaper extends Stationery implements PaperAbility {

    public PieceOfPaper(int price) {
        super(price);
    }

    @Override
    public void mark(){System.out.println("You can write on this thing");}
}
