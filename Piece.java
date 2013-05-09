import java.awt.Color;
import java.util.ArrayList;
public class Piece {
	
	private Color color;
	private int x;
	private int y;

	public Piece(Color color, int x, int y){
		setColor(color);
		setX(x);
		setY(y);
	}

	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.x = y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setColor(Color c){
		if(c == Color.white){
			this.color = Color.white;
		}else if(c == Color.black){
			this.color = Color.black;
		}else{
			System.out.println("Color input error.  Color has been set to green.");
			this.color = Color.green; 
		}
	}

	/**
	 * getMoveLocations
	 * 		returns a arraylist of the possible move locations of the given piece, will be overwritten in all sublclasses except for the king class
	 * 		Default - returns the move locations for the King piece
	 * 		POSTCONDITION - nothing on the board has been changed at all. EVER. NEVER.
	 * 		@return - the array list of possible position for a piece to move
	 */
	public ArrayList<Position> getMovePositions(){
		return getUnoccupiedAdjacentPositions();
	}

	/**
	 * getUnoccupiedAdjacentPositions
	 * 		returns an arraylist of the unoccupied and valid locations next to a given piece
	 * @return - the array list of locations next to the object that are valid and dont have any other pieces in them
	 */
	public ArrayList<Position> getUnoccupiedAdjacentPositions(){
		ArrayList<Position> adjPos = new ArrayList<Position>();
		for(int x = this.x - 1; x <= this.x + 1; x++){
			for(int y = this.y - 1; y <= this.y + 1; y--){
				if(getPosition(x, y) != null && getPosition(x, y).getPiece() != null){
					adjPos.add(getPosition(x, y));
				}
			}
		}
		
	}






}