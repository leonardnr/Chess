public class Position {
	
	private int xCoord;
	private int yCoord;
	Piece piece;

	public Position(int x, int y, Piece p){
		setXCoord(x);
		setYCoord(y);
		setPiece(p);
	}


	public Boolean hasAPiece(){
		return this.piece != null;
	}

	public void setXCoord(int x){
		if(x <= 7){
			this.xCoord = x;
		}else{
			System.out.println("Position not valid on board.");
		}
	}

	public void setYCoord(int y){
		if(y <= 7){
			this.yCoord = y;
		}else{
			System.out.println("Position not valid on board.");
		}
	}

	public void setPiece(Piece p){
		this.piece = p;
	}

	public int getX(){
		return this.xCoord;
	}

	public int getY(){
		return this.yCoord;
	}

	public Piece getPiece(){
		return this.piece;
	}
}