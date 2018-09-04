public class Player {
    private char symbol;
    private static int gamesWon = 0, gamesLost = 0, gamesDrawn = 0;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }


}
