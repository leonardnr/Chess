import java.awt.*;
import javax.swing.*;

public class Board extends JPanel{
	
	private static Position[][] positions;
	private static JPanel panel;
	public Board(){
		super(new GridLayout(8, 8));

		this.setPreferredSize(new Dimension(1000, 1000));

		positions = new Position[8][8];
		for(int x = 0; x < 8; x++){
			for(int y = 0; y < 8; y++){
				Position p = new Position(x * 100, y * 100);
				// System.out.print(x);
				// System.out.print(y);
				// System.out.println();
				this.add(p);
				positions[x][y] = p;
			}
		}
		setBoard();


		this.validate();
		this.setVisible(true);
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

	public void paint(Graphics g) {
		// super.paint(g);
		//g.setColor(Color.red);
		//g.fillRect(0, 0, (int)this.getSize().getWidth(), (int)this.getSize().getHeight());
		boolean white = true;
		boolean lastRowWhite = true;
		for (int r = 0; r < positions.length; r++) {
			for (int f = 0; f < positions[r].length; f++ ) {
				if(white){
					positions[r][f].draw(g, r, f, Color.lightGray);
					white = false;
				}else{
					positions[r][f].draw(g, r, f, Color.darkGray);
					white = true;
				}

			}
			if(lastRowWhite){
				white = false;
				lastRowWhite = false;
			}else{
				white = true;
				lastRowWhite = true;
			}
		}
	}

	/**
	 * blackPawns
	 * 		sets up the row of black pawns at the second row of the board
	 */
	public static void blackPawns(){
		for(int i = 0; i < 8; i++){
			positions[i][1].setPiece(new Pawn(Color.black, i, 1, false));
		}
	}
	/**
	 * whitePawns
	 * 		sets up the row of black pawns at the 7th row of the board
	 */
	public static void whitePawns(){
		for(int i = 0; i < 8; i++){
			positions[i][6].setPiece(new Pawn(Color.white, i, 6, true));
		}
	}
	/**
	 * backBlackRow
	 * 		sets up the row of black pieces with the knights, rooks, bishops, queen, and king
	 */
	public static void backBlackRow(){
		positions[0][0].setPiece(new Rook(Color.black, 0, 0, false));
		positions[7][0].setPiece(new Rook(Color.black, 7, 0, false));
		positions[1][0].setPiece(new Knight(Color.black, 1, 0, false));
		positions[6][0].setPiece(new Knight(Color.black, 6, 0, false));
		positions[2][0].setPiece(new Bishop(Color.black, 2, 0, false));
		positions[5][0].setPiece(new Bishop(Color.black, 5, 0, false));
		positions[3][0].setPiece(new Queen(Color.black, 3, 0, false));
		positions[4][0].setPiece(new King(Color.black, 4, 0, false));
	}

	/**
	 * backWhiteRow
	 * 		sets up the row of white pieces with the knights, rooks, bishops, queen, and king
	 */
	public static void backWhiteRow(){
		positions[0][7].setPiece(new Rook(Color.white, 0, 7, true));
		positions[7][7].setPiece(new Rook(Color.white, 7, 7, true));
		positions[1][7].setPiece(new Knight(Color.white, 1, 7, true));
		positions[6][7].setPiece(new Knight(Color.white, 6, 7, true));
		positions[2][7].setPiece(new Bishop(Color.white, 2, 7, true));
		positions[5][7].setPiece(new Bishop(Color.white, 5, 7, true));
		positions[4][7].setPiece(new Queen(Color.white, 4, 7, true));
		positions[3][7].setPiece(new King(Color.white, 3, 7, true));
	}

}