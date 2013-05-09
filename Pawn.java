import java.awt.Color;


public class Pawn extends Piece{
	
	private boolean hasMoved;

	public Pawn(Color color, int x){
		super(color);
		if(color== Color.WHITE){
			int y=6; 
		} else if(color == Color.BLACK){
			int y=1;
		}
		this.x=x;
		hasMoved=false;
	}

	public ArrayList<Position> getMovePositions(){
		ArrayList<Position> moves = new ArrayList<Position>();
		if(!hasMoved && color==Color.WHITE && getPosition(this.x,y-1) != null && getPosition(this.x,y-2) != null){
			moves.add(getPosition(x,y-2));
			moves.add(getPosition(x,y-1));
		} else if(!hasMoved && color==Color.WHITE && getPosition(this.x,y-1) != null){
			moves.add(getPosition(x,y-1));
		} else if(!hasMoved && color==Color.BLACK && getPosition(this.x,y-1) != null && getPosition(this.x,y-2) != null){
			moves.add(getPosition(x,y+2));
			moves.add(getPosition(x,y+1));
		} else if(!hasMoved && color==Color.BLACK && getPosition(this.x,y-1) != null){
			moves.add(getPosition(x,y+1));
		}
		return moves.addAll(getAttackLocations());

	}


	public ArrayList<Position> getAttackLocations(){
		ArrayList<Position> moves = new ArrayList<Position>();
		if(color == Color.WHITE && getPosition(x+1,y-1) != null && getPosition(x+1,y-1).hasAPiece()){
			moves.add(getPosition(x+1,y-1));
		} else if(color == Color.WHITE && getPosition(x-1,y-1) != null && getPosition(x-1,y-1).hasAPiece()){
			moves.add(getPosition(x-1,y-1));
		} else if(color == Color.BLACK && getPosition(x+1,y+1) != null && getPosition(x+1,y+1).hasAPiece()){
			moves.add(getPosition(x-1,y+1));
		} else if(color == Color.BLACK && getPosition(x-1,y+1) != null && getPosition(x-1,y+1).hasAPiece()){
			moves.add(getPosition(x+1,y+1));
		}
		return moves;

	}

	public void hasMoved(){
		if(!hasMoved){
			hasMoved=true
		}
	}
}