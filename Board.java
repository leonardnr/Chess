import java.awt.*;
import javax.swing.*;

public class Board extends JPanel{
	
	private static Position[][] positions;

	public Board(){
		positions = new Position[8][8];
		setBoard();

	}

	/**
	 * getPosition
	 * 		returns the position at the specified x and y coords
	 * @param  x the x coord of the position
	 * @param  y the y coord of the position
	 * @return   the position at the coords
	 */
	public static Position getPosition(int x, int y){
		if(x<8 && x>=0 && y<8 && y>=0){
			return positions[x][y];
		} 
		return null;
	}
	/**
	 * setBoard
	 * 		sets up a brand new game board
	 */
	public static void setBoard(){
		whitePawns();
		blackPawns();
		backBlackRow();
		backWhiteRow();

	}

	/**
	 * blackPawns
	 * 		sets up the row of black pawns at the second row of the board
	 */
	public static void blackPawns(){
		for(int i = 0; i < 8; i++){
			positions[i][1].setPiece(new Pawn(Color.black));
		}
	}
	/**
	 * whitePawns
	 * 		sets up the row of black pawns at the 7th row of the board
	 */
	public static void whitePawns(){
		for(int i = 0; i < 8; i++){
			positions[i][6].setPiece(new Pawn(Color.white));
		}
	}
	/**
	 * backBlackRow
	 * 		sets up the row of black pieces with the knights, rooks, bishops, queen, and king
	 */
	public static void backBlackRow(){
		positions[0][0].setPiece(new Rook(Color.black));
		positions[0][7].setPiece(new Rook(Color.black));
		positions[0][1].setPiece(new Knight(Color.black));
		positions[0][6].setPiece(new Knight(Color.black));
		positions[0][2].setPiece(new Bishop(Color.black));
		positions[0][5].setPiece(new Bishop(Color.black));
		positions[0][3].setPiece(new Queen(Color.black));
		positions[0][4].setPiece(new King(Color.black));
	}

	/**
	 * backWhiteRow
	 * 		sets up the row of white pieces with the knights, rooks, bishops, queen, and king
	 */
	public static void backWhiteRow(){
		positions[7][0].setPiece(new Rook(Color.black));
		positions[7][7].setPiece(new Rook(Color.black));
		positions[7][1].setPiece(new Knight(Color.black));
		positions[7][6].setPiece(new Knight(Color.black));
		positions[7][2].setPiece(new Bishop(Color.black));
		positions[7][5].setPiece(new Bishop(Color.black));
		positions[7][4].setPiece(new Queen(Color.black));
		positions[7][3].setPiece(new King(Color.black));
	}

}