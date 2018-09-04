import java.util.*;

public class Game implements Drawable, Playable {
    private char[][] moves = new char[3][3];
    private Map<Character,Player> players = new HashMap<>();


    /**
     * Constructing the Game object with 2 players:
     * @param x - Player x
     * @param o - Player o
     */
    public Game(Player x, Player o) {
        players.put(x.getSymbol(),x);
        players.put(o.getSymbol(),o);
    }

    /**
     * Populates the board with empty cells represented by character "_"
     */
    private void initializeBoard(){
        System.out.println("populating moves with default \"_\" ");
        for(int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[i].length; j++) {
                moves[i][j] = '_';
            }
        }
    }

    /**
     * @return true if no free cell is left
     */
    private boolean boardIsFull(){
        boolean result = false;
        for(char[] line:moves){
            for(char cell:line){
                if(cell == '_'){
                    return result;
                }
            }
        }
        return  true;
    }

    /**
     * Checks if the cell having the coordinates below, is free
     * @param row the row of questioned cell
     * @param col the column of questioned cell
     * @return true if the cell is free
     */
    private boolean cellIsFree(int row, int col){
        boolean result = false;
        if (moves[row][col] == '_'){
            result = true;
        } else {
            System.out.print(
                    "Wrong move. Use only free squares - that one is taken: " + moves[row][col] +
                            "\nTry again. Enter your move (row[1-3] column[1-3]):");
        }
        return result;
    }

    /**
     * Checks if the user input has the right format (row[1-3] column[1-3]): "digit/space/digit"
     * @param userText user input text
     * @return true if input is correct and therefore can be converted into integer later on
     */
    private boolean inputIsValid(String userText){
        boolean result = false;
        if (userText.matches("[1-3] [1-3]")){
            result = true;
        } else {
            System.out.print(
                    "Wrong input. Use one space between 2 one digit numbers." +
                            "\nTry again. Enter your move (row[1-3] column[1-3]):");
        }
        return result;
    }

    private boolean equalAndNotEmpty(char c1, char c2, char c3){
        if (c1 == '_' || c2 == '_' || c3 == '_'){
            return false;
        } else {
            if (c1 == c2 && c2 == c3) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Method to check if the game ended or not after last move.
     * @param player the player that just made a move
     * @return
     */
    public Player checkGameStatusAfterMoveOf(Player player){
        boolean gameWon = false;

        if (player == null){
            throw new NullPointerException("There was a null player object passed as a param in checkGameStatusAfterMoveOf");
        }

        for(int k = 0; k < 3 ; k++){
            if (equalAndNotEmpty(moves[0][k], moves[1][k], moves [2][k]) ||
                equalAndNotEmpty(moves[k][0], moves[k][1], moves [k][2])){
                gameWon = true;
            }
        }
        if (equalAndNotEmpty(moves[0][0], moves[1][1], moves[2][2]) ||
            equalAndNotEmpty(moves[0][2], moves[1][1], moves[2][0])){
            gameWon = true;
        }
        if (gameWon){
            System.out.println("Player " + player.getSymbol() + " won!");
            return null;
        }

        if (boardIsFull()){
            System.out.println("Game ended in a draw.");
            return null;
        }

        try{
            return getPlayerAfter(player);
        } catch (NullPointerException e){
            e.getMessage();
        }
        return null;
    }

    /**
     * After checking the status of the game, if the game continues, next player must move:
     * @param player the player that just made a move
     * @return
     */
    private Player getPlayerAfter(Player player) {
        if (player == null){
            throw new NullPointerException("There was a null player object passed as a param");
        }
        if (player.getSymbol() == 'x'){
            try{
                return players.get('o');
            } catch (NoSuchElementException e){
                e.getMessage();
            }
        } else {
            try{
                return players.get('x');
            } catch (NoSuchElementException e){
                e.getMessage();
            }
        }
        return null;
    }

    /**
     * Method for reading user input and posting it's symbol (x/o) on the board as per coordinates read
     * @param player at move.
     */
    public void play(Player player){
        String userInput;
        int row, col, wrongInput = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Player " + player.getSymbol() + ", enter your move (row[1-3] column[1-3]):");
        userInput = input.nextLine();

        do{
        if (inputIsValid(userInput)) {
            row = (int) Character.getNumericValue(userInput.charAt(0))-1;
            col = (int) Character.getNumericValue(userInput.charAt(2))-1;
            if (cellIsFree(row, col)) {
                this.moves[row][col] = player.getSymbol();
                break;
            } else {
                userInput = input.nextLine();
                wrongInput++;
                if (wrongInput == 3){
                    System.out.println("You cannot follow simple instructions. Sorry.");
                    System.exit(1);
                }
            }
        } else {
            userInput = input.nextLine();
            wrongInput++;
            if (wrongInput == 3){
                System.out.println("You cannot follow simple instructions. Sorry.");
                System.exit(1);
            }
        }
        } while(wrongInput < 3);
        draw();
    }

    public void playGame() {
        this.initializeBoard();
        draw();
        Player p = new Player('x');
        try{
            p = players.get('x');
        } catch (NoSuchElementException e){
            e.getMessage();
            players.put('x',p);
            System.out.println("A new player \"x\" was created and added to players list");
        }
        do{
            play(p);
            p = checkGameStatusAfterMoveOf(p);
        }while (p!=null);
    }

    /**
     * method to draw the board using the current state of the moves array
     */
    @Override
    public void draw() {
        System.out.println(
                " " + this.moves[0][0] + " |" +
                " " + this.moves[0][1] + " |" +
                " " + this.moves[0][2] + " " +
                "\n-----------\n" +
                " " + this.moves[1][0] + " |" +
                " " + this.moves[1][1] + " |" +
                " " + this.moves[1][2] + " " +
                "\n-----------\n" +
                " " + this.moves[2][0] + " |" +
                " " + this.moves[2][1] + " |" +
                " " + this.moves[2][2] + " \n"
        );
    }


}
