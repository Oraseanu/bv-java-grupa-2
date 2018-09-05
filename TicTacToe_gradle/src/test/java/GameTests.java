import org.junit.Assert;
import org.junit.Test;

public class GameTests {
    Game g = new Game(new Player('x'), new Player('o'));

    @Test
    public void testInputIsValidNegative(){
        //negative tests
        String[] invalidInputs = {" 2 2", "2 2 ", "2  2", "22", "2 30", "30 3", "4 4", "0 -1", "10", "a b", "0 0"};
        for(String input:invalidInputs){
            Assert.assertFalse(g.inputIsValid(input));
        }
    }

    @Test
    public void testInputIsValid(){
        //positive tests
        String[] validInputs = {"1 1", "2 2", "3 3", "1 3"};
        for(String input:validInputs){
            Assert.assertTrue(g.inputIsValid(input));
        }
    }

    @Test
    public void testEqualAndNotEmptyNegative(){
        //negative tests
        char[][] invalidInputs = {
                {'_', '_', 'x'},
                {'x', 'x', '_'},
                {'o', '_', '_'},
                {'o', 'o', 'x'},
                {'_', ' ', '_'},
                {' ', ' ', ' '},
                {'_', 'x', '0'}};
        for(char[] inputSet:invalidInputs){
            System.out.println(g.equalAndNotEmpty(inputSet[0], inputSet[1], inputSet[2]));
            Assert.assertFalse(g.equalAndNotEmpty(inputSet[0], inputSet[1], inputSet[2]));
        }
    }

    @Test
    public void testEqualAndNotEmpty(){
        //positive tests
        char[][] invalidInputs = {
                {'x', 'x', 'x'},
                {'o', 'o', 'o'}};
        for(char[] inputSet:invalidInputs){
            System.out.println(g.equalAndNotEmpty(inputSet[0], inputSet[1], inputSet[2]));
            Assert.assertTrue(g.equalAndNotEmpty(inputSet[0], inputSet[1], inputSet[2]));
        }
    }

    @Test
    public void testCellIsFreeNegative(){
        char[][] moves = {
                {'_', ' ', 'x'},
                {'x', 'x', '_'},
                {'o', 'o', 'x'}};

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                g.setMove(row, col, moves[row][col]);
            }
        }
        Assert.assertFalse(g.cellIsFree(1,0));
        Assert.assertFalse(g.cellIsFree(2,0));

    }

    @Test
    public void testCellIsFree(){
        char[][] moves = {
                {'_', ' ', 'x'},
                {'x', 'x', '_'},
                {'o', 'o', 'x'}};

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                g.setMove(row, col, moves[row][col]);
            }
        }
        Assert.assertTrue(g.cellIsFree(1,2));
        Assert.assertTrue(g.cellIsFree(0,1));

    }


}
