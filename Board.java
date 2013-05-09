public class Board{
	
	private Position[][] positions;

	public class Board(){
		positions = new Position[8][8];

	}

	public Position getPosition(int x, int y){
		if(x<8 && x>=0 && y<8 && y>=0){
			return positions[x][y];
		} 
		return null;
	}

}