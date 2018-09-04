/**
 * TicTacToe app
 * @author Oraseanu Daniel
 */

import java.util.Scanner;

public class TicTacToeApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to TicTacToe!" +
                "\nEnter players names:" +
                "\nPlayer x: ");
        String xName = input.nextLine();
        System.out.println("\nPlayer o: ");
        String oName = input.nextLine();
        Player x = new Player('x', xName);
        Player o = new Player('o', oName);
        Game game1 = new Game(x,o);
        String answer;
        do{
            System.out.println(game1);
            game1.playGame();
            System.out.println(game1);
            System.out.println("Play again? (y/n)");
            answer = input.nextLine();
        } while (answer.equalsIgnoreCase("y"));



    }
}
