package strategy.score_game_context;

import strategy.score_game_context.interfaces.*;

public class Clowns implements ScoreBoardBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) - 10;
	}
    
}