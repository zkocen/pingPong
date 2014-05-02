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
        ++pl;
        return ++pl1;
    }

    public static int player2point() {
        ++pl;
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

    public static boolean gameNotFinished() {
        if (pl1 <= 11 && pl1 != 0) {
            return true;
        }
        if (pl2 <= 11 && pl2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean gameFinishedPl2() {
        if (pl2 == 11) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean gameFinishedPl1() {
        if (pl2 == 11) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean changeServe() {
        if (pl % 3 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean player2Serves() {
        if (changeServe()) {
            serve1 = false;
            serve2 = true;
            return true;
        } else {
            serve2 = false;
            serve1 = true;
            return false;
        }
    }

    public static boolean player1Serves() {
        if (changeServe()) {
            serve2 = false;
            serve1 = true;
            return true;
        } else {
            serve1 = false;
            serve2 = true;
            return false;
        }
    }
}
