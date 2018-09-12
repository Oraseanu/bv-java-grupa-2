/**
 * Class for player
 * Can remember games won/lost/drawn
 * Player has name and symbol (x or o)
 */
public class Player {
    private char symbol;
    private String name;

    private int gamesWon = 0, gamesLost = 0, gamesDrawn = 0;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon += gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost += gamesLost;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    public void setGamesDrawn(int gamesDrawn) {
        this.gamesDrawn += gamesDrawn;
    }

    public Player(char symbol) {
        this.symbol = symbol;
    }
    public Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Playing with " + symbol +
                ": " + name +
                "(gamesWon=" + gamesWon +
                ", gamesLost=" + gamesLost +
                ", gamesDrawn=" + gamesDrawn + ")"
                ;
    }
}
