package grade12assignments;


import java.awt.Color;

/**
 * This class manages the interactions between the different pieces of the game:
 * the Board, the Daleks, and the Doctor. It determines when the game is over
 * and whether the Doctor won or lost.
 */
public class CatchGame {

    /**
     * Instance variables go up here Make sure to create a Board, 3 Daleks, and
     * a Doctor
     */
    private Board board;

    /**
     * The constructor for the game. Use it to initialize your game variables.
     * (create people, set positions, etc.)
     */
    public CatchGame() {
        // create the game board that is 12x12
        board = new Board(12, 12);
    }

    /**
     * The playGame method begins and controls a game: deals with when the user
     * selects a square, when the Daleks move, when the game is won/lost.
     */
    public void playGame() {
        //put down a peg
        board.putPeg(Color.RED, 0, 0);

        board.displayMessage("Click a peg to remove");

        Coordinate click2 = board.getClick();
        int row2 = click2.getRow();
        int col2 = click2.getCol();
        // remove a peg
        board.removePeg(row2, col2);

        // game loop
        while (true) {
            board.displayMessage("Click on a spot to add a peg");
            // waits for the user to click on a spot
            Coordinate click = board.getClick();
            // the row and col from the click
            int row = click.getRow();
            int col = click.getCol();
            // put a peg there
            board.putPeg(Color.GREEN, row, col);

        }
    }

}
