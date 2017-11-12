package com.epam.classwork.studyEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Kitty {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();

        System.out.print("Enter the name of kitty: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(kitty.getName(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getName(String nameKitty) {
        for (Name name : Name.values()) {
            if (Objects.equals(name.toString(), nameKitty)) {
                return nameKitty + " come at home";
            }
        }

        throw new IllegalArgumentException("Wrong kitten name " + nameKitty);

    }

}
