public class Bishop extends Piece {


	public Bishop() {

	}

	
	public ArrayList<Postion> getMovePositions() {
		int i = 1;
		ArrayList<Postion> possibleMoves = new ArrayList<Postion>;
		/*
		Upper Right Positions
		 */
		while(getPosition(x+i, y+i) != null) {
			if(getPosition(x+i, y+i).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(x+i, y+i));
			i++;
		}
		/*
		Upper Left Positions
		 */
		while(getPosition(x-i, y+i) != null) {
			if(getPosition(x-i, y+i).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(x-i, y+i));
			i++;
		}
		/*
		Lower Right Positions
		 */
		while(getPosition(x+i, y-i) != null) {
			if(getPosition(x+i, y-i).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(x+i, y-i));
			i++;
		}
		/*
		Lower Left Positions
		 */
		while(getPosition(x-i, y-i) != null) {
			if(getPosition(x-i, y-i).hasAPiece()){
				break;
			}
			possibleMoves.add(getPosition(x-i, y-i));
			i++;
		}
	return possibleMoves;
	}

	public void makeMove() {

	}
	
}