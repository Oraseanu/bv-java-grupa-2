public class Player {
    private char side;

    public char getSide() {
        return side;
    }
    private static int gamesWon = 0, gamesLost = 0, gamesDrawn = 0;

    public Player(char side) {
        this.side = side;
    }

}
