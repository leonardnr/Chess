import java.awt.Color;
import java.util.ArrayList;


public class Pawn extends Piece{
	
	private boolean hasMoved;

	public Pawn(Color color, int x, int y, Boolean isWhite){
		super(color, x, y, isWhite);
		if(color== Color.WHITE){
			setY(6);
		} else if(color == Color.BLACK){
			setY(1);
		}
		hasMoved=false;
	}

	public ArrayList<Position> getMovePositions(){
		ArrayList<Position> moves = new ArrayList<Position>();
		if(!hasMoved && super.getColor()==Color.WHITE && Board.getPosition(super.getX(),super.getY()-1) != null && Board.getPosition(super.getX(),getY()-2) != null && !Board.getPosition(super.getX(),getY()-1).hasAPiece() && !Board.getPosition(super.getX(),getY()-2).hasAPiece()){
			moves.add(Board.getPosition(super.getX(),super.getY()-2));
			moves.add(Board.getPosition(super.getX(),getY()-1));
		} else if(!hasMoved && super.getColor()==Color.WHITE && Board.getPosition(super.getX(),getY()-1) != null && !Board.getPosition(super.getX(),getY()-1).hasAPiece()){
			moves.add(Board.getPosition(super.getX(),getY()-1));
		} else if(!hasMoved && super.getColor()==Color.BLACK && Board.getPosition(super.getX(),getY()+1) != null && Board.getPosition(super.getX(),getY()+2) != null && !Board.getPosition(super.getX(),getY()+1).hasAPiece() && !Board.getPosition(super.getX(),getY()+2).hasAPiece()){
			moves.add(Board.getPosition(super.getX(),getY()+2));
			moves.add(Board.getPosition(super.getX(),getY()+1));
		} else if(!hasMoved && super.getColor()==Color.BLACK && Board.getPosition(super.getX(),getY()+1) != null && !Board.getPosition(super.getX(),getY()+1).hasAPiece()){
			moves.add(Board.getPosition(super.getX(),getY()+1));
		}
		moves.addAll(getAttackLocations());
		return moves;

	}


	public ArrayList<Position> getAttackLocations(){
		ArrayList<Position> moves = new ArrayList<Position>();
		if(super.getColor() == Color.WHITE && Board.getPosition(super.getX()+1,getY()-1) != null && Board.getPosition(super.getX()+1,getY()-1).hasAPiece()){
			moves.add(Board.getPosition(super.getX()+1,getY()-1));
		} else if(super.getColor() == Color.WHITE && Board.getPosition(super.getX()-1,getY()-1) != null && Board.getPosition(super.getX()-1,getY()-1).hasAPiece()){
			moves.add(Board.getPosition(super.getX()-1,getY()-1));
		} else if(super.getColor() == Color.BLACK && Board.getPosition(super.getX()+1,getY()+1) != null && Board.getPosition(super.getX()+1,getY()+1).hasAPiece()){
			moves.add(Board.getPosition(super.getX()-1,getY()+1));
		} else if(super.getColor() == Color.BLACK && Board.getPosition(super.getX()-1,getY()+1) != null && Board.getPosition(super.getX()-1,getY()+1).hasAPiece()){
			moves.add(Board.getPosition(super.getX()+1,getY()+1));
		}
		return moves;

	}

	public void hasMoved(){
		if(!hasMoved){
			hasMoved=true;
		}
	}
}