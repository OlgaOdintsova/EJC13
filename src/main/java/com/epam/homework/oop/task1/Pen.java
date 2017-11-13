package com.epam.homework.oop.task1;

public class Pen {
    private int price;
    private String name;

    public Pen(int price, String name){
        this.price = price;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (null == obj){
            return false;
        }

        if (this ==obj){
            return true;
        }

        if (obj.getClass() != Pen.class){
            return false;
        }

        Pen pen = (Pen) obj;
        if (price != pen.price) {
            return false;
        }

        if (null == name) {
            return (name == pen.name);
        } else {
            if (!name.equals(pen.name)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String toString() {
        return getClass().getName() + "@" + "price: " + price + ", name: " + name;
    }
}
