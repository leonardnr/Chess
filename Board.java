public class Board{
	
	private static Position[][] positions;

	public Board(){
		positions = new Position[8][8];

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

}