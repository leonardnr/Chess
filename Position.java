import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Position extends JPanel implements MouseListener {
	
	private int xCoord;
	private int yCoord;
	Piece piece;
	Color color;
	Board board;
	ArrayList<Position> positions;

	public Position(int x, int y, Piece p, Board b){
		setXCoord(x);
		setYCoord(y);
		setPiece(p);
		setColor(Color.black);
		this.board = b;
		this.addMouseListener(this);
		
	}
	public Position(int x, int y, Board b){
		setXCoord(x);
		setYCoord(y);
		setColor(Color.black);
		this.board = b;
		this.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e){
		
		
	}
	public void mouseEntered(MouseEvent e){
		
	}
	public void mouseExited(MouseEvent e){

	}
	public void mousePressed(MouseEvent e){
		if(this.hasAPiece()){
			System.out.println("Position clicked.");
			positions = getPiece().getMovePositions();
			for(Position p : positions){
				this.setColor(Color.blue);
				
			}
			this.board.repaint();
		}
	}
	public void mouseReleased(MouseEvent e){
		positions 
	}



	public void draw(Graphics g, int rank, int file, Color color) {

		if(this.color != Color.blue){
			this.setColor(color);
			g.setColor(this.color);
		}else{
			g.setColor(this.color);
		}
		
		Dimension d = this.getSize();
		g.fillRect(rank*100, file*100, 110, 110);
		if(getPiece() != null){
			getPiece().draw(g, d, this);
		}
	}

	public void setColor(Color c){
		this.color = c;
	}


	public Boolean hasAPiece(){
		return this.piece != null;
	}

	public void setXCoord(int x){
			this.xCoord = x;
	}


	public void setYCoord(int y){
			this.yCoord = y;
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