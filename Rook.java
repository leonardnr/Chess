public class Rook extends Piece {
	
	private boolean onBoard;

	public Rook() {

	}

	public ArrayList<Position> getMovePositions() {
		int i = 0;
		ArrayList<Position> possibleMoves = new ArrayList<Position>;
		/*
		Up Positions
		 */
		while(getPosition(super.getX(), super.getY()+i) != null) {
			if(getPosition(super.getX(), super.getY()+i).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(super.getX(), super.getY()+i));
			i++;
		}
		/*
		Down Positions
		 */
		while(getPosition(super.getX(), super.getY()-i) != null) {
			if(getPosition(super.getX(), super.getY()-i).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(super.getX(), super.getY()-i));
			i++;
		}
		/*
		Right Positions
		 */
		while(getPosition(super.getX()+i, super.getY()) != null) {
			if(getPosition(super.getX()+i, super.getY()).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(super.getX()+i, super.getY()));
			i++;
		}
		/*
		Left Positions
		 */
		while(getPosition(super.getX()-i, super.getY()) != null) {
			if(getPosition(super.getX()-i, super.getY()).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(super.getX()-i, super.getY()));
			i++;
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
}