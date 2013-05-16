import java.awt.Color;
import java.util.ArrayList;

public class King extends Piece {

	public King(Color color) {
		super(color);
	}

	public ArrayList<Position> getMovePositions() {
		int i = 1;
		ArrayList<Position> possibleMoves = new ArrayList<Position>();
		/**
		 * above
		 */
		while(Board.getPosition(super.getX(), getY()+1) != null) {
			if(Board.getPosition(super.getX(), getY()+1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX(), getY()+1));
			
		}
		/**
		 * Upper Right
		 */
		while(Board.getPosition(super.getX()+1, getY()+1) != null) {
			if(Board.getPosition(super.getX()+1, getY()+1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+1, getY()+1));
			
		}
		/**
		 * Upper Left
		 */
		while(Board.getPosition(super.getX()-1, getY()-1) != null) {
			if(Board.getPosition(super.getX()-1, getY()-1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-1, getY()-1));
			
		}
		/**
		 * Lower Left
		 */
		while(Board.getPosition(super.getX()-1, getY()-1) != null) {
			if(Board.getPosition(super.getX()-1, getY()-1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-1, getY()-1));
			
		}
		/**
		 * below
		 */
		while(Board.getPosition(super.getX(), getY()-1) != null) {
			if(Board.getPosition(super.getX(), getY()-1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX(), getY()-1));
			
		}
		/**
		 * Lower Right
		 */
		while(Board.getPosition(super.getX()+1, getY()-1) != null) {
			if(Board.getPosition(super.getX()+1, getY()-1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+1, getY()-1));
			
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
	
}