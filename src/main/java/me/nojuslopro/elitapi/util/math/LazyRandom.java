package me.nojuslopro.elitapi.util.math;

import java.util.Random;

public class LazyRandom {
    public static int randomInt(int maxNumber) {
        if (maxNumber > 0) {
            Random randomObject = new Random();
            int randomNumber = randomObject.nextInt(maxNumber);
            return randomNumber;
        } else {
            throw new RuntimeException("Number can't be less than 0!");
        }
    }


}
