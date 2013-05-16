import java.awt.Color;
import java.util.ArrayList;

public class Rook extends Piece {
	
	private boolean onBoard;

	public Rook(Color color) {
		super(color);
	}

	public ArrayList<Position> getMovePositions() {
		int i = 0;
		ArrayList<Position> possibleMoves = new ArrayList<Position>();
		/*
		Up Positions
		 */

		while(Board.getPosition(super.getX(),getY()+i) != null) {
			if(Board.getPosition(super.getX(), getY()+i).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX(), getY()+i));
			i++;
		}
		/*
		Down Positions
		 */

		while(Board.getPosition(super.getX(),getY()-i) != null) {
			if(Board.getPosition(super.getX(), getY()-i).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX(), getY()-i));
			i++;
		}
		/*
		Right Positions
		 */
		while(Board.getPosition(super.getX()+i, getY()) != null) {
			if(Board.getPosition(super.getX()+i, getY()).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+i, getY()));
			i++;
		}
		/*
		Left Positions
		 */
		while(Board.getPosition(super.getX()-i,getY()) != null) {
			if(Board.getPosition(super.getX()-i, getY()).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-i, getY()));
			i++;
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
}