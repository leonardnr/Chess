import java.awt.Color;
import java.util.ArrayList;

public class Queen extends Piece{

	public Queen(Color color, int x, int y, boolean isWhite){
		super(color, x, y, isWhite);
	}

	public ArrayList<Position> getMovePositions(){
		ArrayList<Position> moves = getMovePositionsR();
		moves.addAll(getMovePositionsB());
		return moves;

	}

	public ArrayList<Position> getMovePositionsR() {
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

	public ArrayList<Position> getMovePositionsB() {
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