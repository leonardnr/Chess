public class Bishop extends Piece {


	public Bishop() {

	}

	
	public ArrayList<Postion> getMovePositions() {
		int i = 1;
		ArrayList<Postion> possibleMoves = new ArrayList<Postion>;
		/*
		Upper Right Positions
		 */
		while(getPosistion(x+i, y+i) != null) {
			possibleMoves.add(getPosition(x+i, y+1));
			i++;
		}
		/*
		Upper Left Positions
		 */
		while(getPosistion(x-i, y+i) != null) {
			possibleMoves.add(getPosition(x-i, y+1));
			i++;
		}
		/*
		Lower Right Positions
		 */
		while(getPosistion(x+i, y-i) != null) {
			possibleMoves.add(getPosition(x+i, y-1));
			i++;
		}
		/*
		Lower Left Positions
		 */
		while(getPosistion(x-i, y-i) != null) {
			possibleMoves.add(getPosition(x-i, y-1));
			i++;
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
	
}