package com.proftelrun.org.lessonthree.party;

import java.util.ArrayList;

public class PartyApp {
    public static void main(String[] args) {
        Guest[] guests = {};

        for (Guest guest : guests) {
            guest.printGreetings();
        }

        DrinkAlcohol[] drinker = new DrinkAlcohol[10];
        LikeDance[] dancer = new LikeDance[10];
        Sleep[] sleeper = new Sleep[10];

        sortGuest(guests, drinker, dancer, sleeper);


    }






    private static void sortGuest(Guest[] guests, DrinkAlcohol[] drinker, LikeDance[] dancer, Sleep[] sleeper) {
        int daIndex = 0;
        int ldIndex = 0;
        int slIndex = 0;


        for (Guest guest : guests) {
            if (guest instanceof DrinkAlcohol) {
                drinker[daIndex++] = (DrinkAlcohol) guest;
                continue;
            }
            if (guest instanceof LikeDance) {
                dancer[ldIndex++] = (LikeDance) guest;
                continue;
            }
            if (guest instanceof Sleep) {
                sleeper[slIndex++] = (Sleep) guest;
                continue;
            }
        }
    }
}


