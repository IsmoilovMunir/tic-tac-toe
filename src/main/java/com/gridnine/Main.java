package com.gridnine;

// игрок всегда ходить первым
// игрок всегда ставит X
// бот всегда ставит О
// бот выбирает случайную пустую клетку
// без ооп
public class Main {
    public static void main(String[] args) {

    }

    public static void StartGameRound(){
        // create board
        // startGameLoop
    }



    public static void startGemLoop() {
        // while(gameNotOver)
        // playerTurn
        // botTurn
        // checkGameState(X_WON, O_WON, DRAW, GAME_NOT_OVER)

    }

    public static void makePlayerTurn() {
        //get input
        // validate input
        //place X on board
    }

    public static void makeBotTurn() {
        //get Random empty cell
        //place 0 in beard
    }

    public static void checkGameState() {
        // x =1 ; o = -1 emty = 0
        // count sums for rows , columns , diagonals
        // if sum.contains(3) - > x won
        // is sum.contains(-3) -> O won
        // if allCellsTaken() -> draw
        // else -> game not over
    }
}