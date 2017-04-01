package com.bmck2006.funfacts;

import java.util.Random;

public class FactBook {

    // Create fact array. New facts can be added here as needed.
    private final String[] factsArray = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "When a male penguin falls in love with female penguin, he searches the entire beach to find the perfect pebble to present to her.",
            "New Zealand will deny people residency visa’s if they too high of a BMI and there are cases where people have been rejected because of their weight.",
            "Whenever a pregnant women suffers from organ damage like heart attack, the fetus sends stem cells to the organ helping it to repair.",
            "It is illegal to climb trees in Oshawa, a town in Ontario, Canada.",
            "Brown eyes are blue underneath, and you can actually get a surgery to turn brown eyes blue.",
            "Brian McKeown created this app. He has a beautiful fiance named Kayla, and two dogs named Widget and Tucson.",
            "When you blush, the lining of your stomach also turns red.",
            "A bolt of lightning is six times hotter than the sun.",
            "When a person cries and the first drop of tears come from the right eye, its happiness. if it from left eye, it’s pain.",
            "Only 2% of Earth population naturally has green eyes.",
            "Having bridesmaids in a wedding wasn’t originally for moral support. They were intended to confuse evil spirits or those who wished to harm the bride."
    };

    private String fact; // placeholder String
    private Random randomGenerator; // random generator to select random index of array.
    private int randomInt;

    public FactBook() {
        fact = "";
        randomGenerator = new Random(factsArray.length);
    }

    public String getFact() {
        randomInt = randomGenerator.nextInt(factsArray.length);
        fact = factsArray[randomInt];

        return fact;
    }
    public String getFactAt(int i) {
        return factsArray[i];
    }
}
