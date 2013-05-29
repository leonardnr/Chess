import java.awt.Color;
import java.util.ArrayList;

public class Knight extends Piece {
	
	private boolean onBoard;
	
	public Knight(Color color, int x, int y, boolean isWhite) {
		super(color, x, y, isWhite);
	}

	public ArrayList<Position> getMovePositions() {
		ArrayList<Position> possibleMoves = new ArrayList<Position>();
		/*
		Up(2) and Right
		 */
		while(Board.getPosition(super.getX()+1, super.getY()+2) != null) {
			if(Board.getPosition(super.getX()+1, super.getY()+2).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+1, super.getY()+2));
		}
		/*
		Up(2) and Left
		 */
		while(Board.getPosition(super.getX()-1, super.getY()+2) != null) {
			if(Board.getPosition(super.getX()-1, super.getY()+2).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-1, super.getY()+2));
		}
		/*
		Up and Right(2)
		 */
		while(Board.getPosition(super.getX()+2, super.getY()+1) != null) {
			if(Board.getPosition(super.getX()+2, super.getY()+1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+2, super.getY()+1));
		}
		/*
		Up and Left(2)
		 */
		while(Board.getPosition(super.getX()-2, super.getY()+1) != null) {
			if(Board.getPosition(super.getX()-2, super.getY()+1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-2, super.getY()+1));
		}
		/*
		Down(2) and Right
		 */
		while(Board.getPosition(super.getX()+1, super.getY()-2) != null) {
			if(Board.getPosition(super.getX()+1, super.getY()-2).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+1, super.getY()-2));
		}
		/*
		Down(2) and Left
		 */
		while(Board.getPosition(super.getX()-1, super.getY()-2) != null) {
			if(Board.getPosition(super.getX()-1, super.getY()-2).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-1, super.getY()-2));
		}
		/*
		Down and Right(2)
		 */
		while(Board.getPosition(super.getX()+2, super.getY()-1) != null) {
			if(Board.getPosition(super.getX()+2, super.getY()-1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()+2, super.getY()-1));
		}
		/*
		Down and Left(2)
		 */
		while(Board.getPosition(super.getX()-2, super.getY()-1) != null) {
			if(Board.getPosition(super.getX()-2, super.getY()-1).hasAPiece()){
				break;
			}
			possibleMoves.add(Board.getPosition(super.getX()-2, super.getY()-1));
		}
		return possibleMoves;
	}

	public void makeMove() {

	}

}