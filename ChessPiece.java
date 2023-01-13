import java.awt.Color;

import enigma.console.*;
import enigma.core.Enigma;

/**
 * Write a description of class ChessPiece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChessPiece {
    // instance variables - replace the example below with your own
    private int row;
    private int col;
    private char symbol;
    private Color color;
    private Console s_console;

    /**
     * Constructor for objects of class ChessPiece
     */
    public ChessPiece(Console s_console, int row, int col, char symbol, Color color) {
        // initialise instance variables
        this.row = row;
        this.col = col;
        this.symbol = symbol;
        this.color = color;
        this.s_console = s_console;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public Color getColor() {
        return this.color;
    }

    /**
     * Move to row, col on the board
     *
     * @param  row destination row
     * @param  col destination col
     * @return true if can move, false otherwise
     */

    /**
     * I AM PROVIDING THE CHESSBOARD AS PARAMETER BECAUSE I NEED TO CHECK IF THE PIECE IS BLOCKED BY ANOTHER
     * PIECE OR IF IT CAN TAKE ANOTHER ENEMY PIECE
     **/
    public boolean move(int row, int col, ChessPiece[][] cb) {
        if (row >= ChessBoard.ROW_MIN && row <= ChessBoard.ROW_MAX &&
                col >= ChessBoard.COL_MIN && col <= ChessBoard.COL_MAX) {

            //------
            // IMPLEMENT MOVES FOR PAWNS AND ROOKS
            //------

            if (this.color == Color.black) {
                if (this.symbol == 'P') {
                    if (cb[row][col] == null) {
                        if (col == this.col && row == this.row + 1) {
                            this.row = row;
                            return true;
                        }
                        return false;
                    } else if (cb[row][col].color == Color.white) {
                        //TAKE ENEMY PIECE
                        if (row == this.row + 1 && (col == this.col + 1 || col == this.col - 1)) {
                            this.row = row;
                            this.col = col;
                            return true;
                        }
                        return false;
                    }

                    return false;

                } else if (this.symbol == 'R') {
                    //MOVE OR TAKE ENEMY PIECE
                    if (cb[row][col] == null || cb[row][col].color == Color.white) {
                        if (col == this.col && row != this.row) {

                            ///CHECK FOR OBSTACLES IN PATH
                            for (int i = this.row - 1; i > row; i--) {
                                if (cb[i][col] != null) {
                                    return false;
                                }
                            }

                            for (int i = this.row + 1; i < row; i++) {
                                if (cb[i][col] != null) {
                                    return false;
                                }
                            }

                            this.row = row;

                            return true;
                        } else if (col != this.col && row == this.row) {

                            ///CHECK FOR OBSTACLES IN PATH
                            for (int i = this.col - 1; i > col; i--) {
                                if (cb[row][i] != null)
                                    return false;
                            }

                            for (int i = this.col + 1; i < col; i++) {
                                if (cb[row][i] != null)
                                    return false;
                            }

                            this.col = col;

                            return true;
                        }
                        return false;
                    }

                    return false;
                }


                return false;
            }
        }

        return false;
    }

    public void print(TextAttributes attrs, Color back) {
        attrs = new TextAttributes(this.color, back);//Changes the color
        s_console.setTextAttributes(attrs);
        System.out.print(symbol);
    }
}
