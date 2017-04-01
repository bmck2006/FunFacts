package com.bmck2006.funfacts;

import android.graphics.Color;
import java.util.Random;

public class ColorWheel {

    // Create color array. New colors can be added here as needed.
    private final String[] colorArray = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    private String color; // placeholder String
    private Random randomGenerator; // random generator to select random index of array.
    private int randomInt;

    public ColorWheel() {
        randomGenerator = new Random(colorArray.length);
    }

    public int getColor() {
        randomInt = randomGenerator.nextInt(colorArray.length);
        color = colorArray[randomInt];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

    public int getColorAt(int i) {
        return Color.parseColor(colorArray[i]);
    }
}
