package strategy.score_game_context;


public class Run {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.sc = new Ballon();
        scoreBoard.showScore(6, 10);
        scoreBoard.sc = new Clowns();
        scoreBoard.showScore(7, 10);




    }
}