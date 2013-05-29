import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;


public class Piece {
	
	private Color color;
	private int x;
	private int y;

	private BufferedImage image;
	private boolean isWhite;
	private ImageIcon img;

	public Piece(Color color, int x, int y, boolean isWhite){
		setColor(color);
		this.isWhite = isWhite;
		image = ChessApplet.getImage(this);
		img = new ImageIcon(image);
		setX(x);
		setY(y);
	}


	public Piece(Color color){
		setColor(color);
		setX(0);
		setY(0);
	}

	/**
	 * draw
	 * 		paint the piece to the screen, must be called from the paint
	 * 		method of a Graphic object
	 * @param g   - the drawing context
	 * @param dim - dimensions of the containing Square
	 */
	public void draw(Graphics g, Dimension dim, Component c) {
		//g.drawImage(image, x * 100, y * 100, (int)(dim.getWidth() * 1), (int)(dim.getHeight() * 1), null);
		img.paintIcon(c, g, x * 100, y * 100);

	}

	public ImageIcon getImg(){
		return this.img;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
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
	public Color getColor(){
		return color;
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
				if(Board.getPosition(x, y) != null && Board.getPosition(x, y).getPiece() != null){
					adjPos.add(Board.getPosition(x, y));
				}
			}
		}
		return adjPos;
		
	}

	/**
	 * makeMove
	 * 		moves the current piece to the specified position
	 * @param p the position to be moved to
	 */
	public void makeMove(Position p){

	}






}