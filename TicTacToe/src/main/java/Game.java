import java.util.Scanner;

public class Game implements Drawable, Playeable{
    private char[][] moves = new char[3][3];
    private Player x,o;



    private void initializeBoard(){
        System.out.println("populating moves with default \"_\" ");
        for(int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[i].length; j++) {
                moves[i][j] = '_';
            }
        }
        draw();
    }

    public Game(Player x, Player o) {
        this.x = x;
        this.o = o;
    }

//    public boolean gameEnded(){
//
//    }
//
//    public boolean playerWon(){
//




//    }

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

    private void playerMove(Player p){
        String userText;
        int k = 0;
        int row, col;
        Scanner input = new Scanner(System.in);

        System.out.print("Player " + p.getSide() + ", enter your move (row[1-3] column[1-3]):");
        userText = input.nextLine();

        do{
        if (inputIsValid(userText)) {
            row = (int) Character.getNumericValue(userText.charAt(0))-1;
            col = (int) Character.getNumericValue(userText.charAt(2))-1;
            if (cellIsFree(row, col)) {
                this.moves[row][col] = p.getSide();
                break;
            } else {
                userText = input.nextLine();
                k++;
                if (k == 3){
                    System.out.println("You cannot follow simple instructions. Sorry.");
                    System.exit(1);
                }
            }
        } else {
            userText = input.nextLine();
            k++;
            if (k == 3){
                System.out.println("You cannot follow simple instructions. Sorry.");
                System.exit(1);
            }
        }
        }while(k < 3);
        draw();
    }

    @Override
    public void play() {
        this.initializeBoard();
        playerMove(x);
        playerMove(o);


    }

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
                " " + this.moves[2][2] + " "
        );
    }


}
