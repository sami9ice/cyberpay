package com.example.javaclass1;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {
        System.out.println("your love score is: " + ifYouhadMyLove("Mr X.", "Miss X."));
    }

    public static int ifYouhadMyLove(String yourName, String theirName) {
        Random randObject = new Random();
        int lovescore = randObject.nextInt(101);
        if (lovescore > 80) {
            System.out.println("your love each other very well");
        } else if (lovescore > 40) {
            System.out.println("your love each oda but you guys might face challenge");
        } else {
            System.out.println(" no love ");
        }
        return lovescore;
    }
}
