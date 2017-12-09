package com.epam.homework.oop.task234.stationery.paper;

import com.epam.homework.oop.task234.ability.PaperAbility;
import com.epam.homework.oop.task234.stationery.Stationery;

public abstract class PieceOfPaper extends Stationery implements PaperAbility {

    PieceOfPaper(int price) {
        super(price);
    }

    @Override
    public void mark(){System.out.println("You can write on this thing");}
}
