import java.awt.Color;
import java.util.ArrayList;

public class Bishop extends Piece {


	public Bishop(Color color) {
		super(color);
	}

	
	public ArrayList<Position> getMovePositions() {
		int i = 1;
		ArrayList<Position> possibleMoves = new ArrayList<Position>();
		/*
		Upper Right Positions
		 */
		while(Board.getPosition(super.getX()+i, getY()+i) != null) {
			if(Board.getPosition(super.getX()+i, getY()+i).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+i, getY()+i));
			i++;
		}
		/*
		Upper Left Positions
		 */
		while(Board.getPosition(super.getX()-i, getY()+i) != null) {
			if(Board.getPosition(super.getX()-i, getY()+i).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-i, getY()+i));
			i++;
		}
		/*
		Lower Right Positions
		 */
		while(Board.getPosition(super.getX()+i, getY()-i) != null) {
			if(Board.getPosition(super.getX()+i, getY()-i).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+i, getY()-i));
			i++;
		}
		/*
		Lower Left Positions
		 */
		while(Board.getPosition(super.getX()-i, getY()-i) != null) {
			if(Board.getPosition(super.getX()-i, getY()-i).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-i, getY()-i));
			i++;
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
	
}