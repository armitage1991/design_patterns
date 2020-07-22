package strategy.score_game_context;
import strategy.score_game_context.interfaces.*;
public class ScoreBoard {

    public ScoreBoardBase sc;

    public void showScore(int taps, int multiplier){
        System.out.println(sc.calculateScore(taps, multiplier));
    }
    
}