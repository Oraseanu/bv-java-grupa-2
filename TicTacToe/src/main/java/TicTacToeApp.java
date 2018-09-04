public class TicTacToeApp {
    public static void main(String[] args){
        Player dani = new Player('x');
        Player ai = new Player('o');

        Game game1 = new Game(dani,ai);
        game1.playGame();

    }
}
