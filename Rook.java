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
		while(getPosition(x,y+i) != null) {
			possibleMoves.add(getPosition(x, y+i));
			i++;
		}
		/*
		Down Positions
		 */
		while(getPosition(x,y-i) != null) {
			possibleMoves.add(getPosition(x, y-i));
			i++;
		}
		/*
		Right Positions
		 */
		while(getPosition(x+i, y) != null) {
			possibleMoves.add(getPosition(x+i, y));
			i++;
		}
		/*
		Left Positions
		 */
		while(getPosition(x-i,y) != null) {
			possibleMoves.add(getPosition(x-i, y));
			i++;
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
}