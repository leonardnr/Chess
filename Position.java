import java.awt.*;
import javax.swing.*;

public class Position extends JPanel{
	
	private int xCoord;
	private int yCoord;
	Piece piece;

	public Position(int x, int y, Piece p){
		setXCoord(x);
		setYCoord(y);
		setPiece(p);
		
	}
	public Position(int x, int y){
		setXCoord(x);
		setYCoord(y);
	}

	// public void paint(Graphics g){
	// 	super.paint(g);

		
		
	// }

	public void draw(Graphics g, int rank, int file, Color color) {
		System.out.println(xCoord + ":" + yCoord);

		g.setColor(color);
		
		Dimension d = this.getSize();
		g.fillRect(rank*100, file*100, 110, 110);
		if(getPiece() != null){
			getPiece().draw(g, d, this);
		}
	}


	public Boolean hasAPiece(){
		return this.piece != null;
	}

	public void setXCoord(int x){
		//if(x <= 7){
			this.xCoord = x;
		//}else{
		//	System.out.println("Position not valid on board.");
		//}
	}


	public void setYCoord(int y){
		//if(y <= 7){
			this.yCoord = y;
		//}else{
		//	System.out.println("Position not valid on board.");
		//}
	}

	public void setPiece(Piece p){
		this.piece = p;
		//this.add(p.getImg());
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