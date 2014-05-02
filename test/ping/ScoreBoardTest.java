package ping;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.cacccc.ScoreBoard;

public class ScoreBoardTest {

    @Before
    public void before() {
        ScoreBoard.reset();
    }

    @Test
    public void whenTheGameStartsBothPlayersHave0Points() throws Exception {
        assertEquals(0, ScoreBoard.pl1);
        assertEquals(0, ScoreBoard.pl2);
    }

    @Test
    public void whenTheGAmeStartsPlayer1Serves() throws Exception {
        assertEquals(true, ScoreBoard.serve1);
        assertEquals(false, ScoreBoard.serve2);
    }

    @Test
    public void whenAPlayerGetsAPointTheCounterIncrements() throws Exception {
        ScoreBoard.player1point();
        assertEquals(1, ScoreBoard.pl1);
    }

    @Test
    public void everyThreePointsTheServeChanges() throws Exception {
        assertEquals(true, ScoreBoard.serve1);
        ScoreBoard.player1point();
        assertEquals(true, ScoreBoard.serve1);
        ScoreBoard.player1point();
        assertEquals(true, ScoreBoard.serve1);
        ScoreBoard.player1point();
        assertEquals(false, ScoreBoard.serve1);
    }

    @Test
    public void whenPlayer1Scores21PointsHeWins() throws Exception {
        assertEquals(0, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(1, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(2, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(3, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(4, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(5, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(6, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(7, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(8, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(9, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(10, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(11, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(12, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(13, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(14, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(15, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(16, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(17, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(18, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(19, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(20, ScoreBoard.pl1);
        ScoreBoard.player1point();
        assertEquals(21, ScoreBoard.pl1);
        assertEquals(true, ScoreBoard.gameFinishedPl1());
    }

    @Test
    public void whenPlayer2Scores21PointsHeWins() throws Exception {
        assertEquals(0, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(1, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(2, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(3, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(4, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(5, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(6, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(7, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(8, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(9, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(10, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(11, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(12, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(13, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(14, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(15, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(16, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(17, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(18, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(19, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(20, ScoreBoard.pl2);
        ScoreBoard.player2point();
        assertEquals(21, ScoreBoard.pl2);
        assertEquals(true, ScoreBoard.gameFinishedPl2());
    }
}
