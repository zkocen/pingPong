package com.example.cacccc;


public class ScoreBoard {

    public static String gameId;
    public static int pl1 = 0;
    public static int pl2 = 0;

    public static boolean serve1 = true;
    public static boolean serve2 = false;

    public static void player1point() {
        pointScored(true);
        playerScoreToServer("1");
    }

    private static void playerScoreToServer(String playerId) {
        new Server.Score().execute(gameId, playerId);
    }

    public static void player2point() {
        pointScored(false);
        playerScoreToServer("2");
    }

    public static void reset() {
        pl1 = 0;
        pl2 = 0;
        serve1 = true;
        serve2 = false;
        new Server.NewGame().execute();
    }

    public static void toggleService() {
        serve1 = serve2;
        serve2 = !serve1;
    }

    public static boolean gameNotFinished() {
        return !gameFinishedPl1() && !gameFinishedPl2();
    }

    public static boolean gameFinishedPl1() {
        return pl1 >= 21 && pl1 - pl2 > 1;
    }

    public static boolean gameFinishedPl2() {
        return pl2 >= 21 && pl2 - pl1 > 1;
    }

    public static void pointScored(boolean player1) {
        if (player1) {
            pl1++;
        } else {
            pl2++;
        }

        System.out.println(pl1 + ", " + pl2);
        if ((pl1 + pl2) % 3 == 0) {
            toggleService();
        }
    }

    public static boolean player1Serves() {
        return serve1;
    }

    public static boolean player2Serves() {
        return serve2;
    }

}