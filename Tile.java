import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Graphics;

public class Tile extends JPanel {

	Piece piece;

	public Tile(Piece piece) {
		this.piece = piece;
	}

	public void paint(Graphics g) {
		super.paint(g);

		piece.draw(g, this.getSize());
	}

}