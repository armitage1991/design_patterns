package strategy.score_game_context;

import strategy.score_game_context.interfaces.*;

public class Ballon implements ScoreBoardBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
    
}