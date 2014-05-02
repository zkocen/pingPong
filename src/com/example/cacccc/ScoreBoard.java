package com.example.cacccc;

public class ScoreBoard {

    public static int pl = 1;
    public static int pl1 = 0;
    public static int pl2 = 0;

    public static boolean serve1 = true;
    public static boolean serve2 = false;

    public static int points() {
        return ++pl;
    }

    public static int player1point() {
        return ++pl1;
    }

    public static int player2point() {
        return ++pl2;
    }

    public static void reset() {
        pl = 1;
        pl1 = 0;
        pl2 = 0;
        serve1 = true;
        serve2 = false;
    }

    public static void firstServesState() {
        serve1 = false;
        serve2 = true;
    }

    public static void secondServesState() {
        serve1 = true;
        serve2 = false;
    }
}
