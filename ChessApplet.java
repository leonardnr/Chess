import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.util.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;

public class ChessApplet extends JApplet implements ActionListener {
	
	private JPanel panel = new JPanel(new BorderLayout());

	private JPanel topPanel = new JPanel();
	private static JLabel turnLabel = new JLabel("White's Turn");

	private static JPanel whiteCaptures = new JPanel(new GridLayout(8, 0));
	private static JPanel blackCaptures = new JPanel(new GridLayout(8, 0));

	private Board board;
	private static Map<String, BufferedImage> whiteImages = new HashMap<String, BufferedImage>();
	private static Map<String, BufferedImage> blackImages = new HashMap<String, BufferedImage>();


	/**
	 * init
	 * 		constructs an Applet
	 */
	public void init() {
		topPanel.add(turnLabel);
		panel.add(topPanel, BorderLayout.NORTH);

		loadImages();

		board = new Board();
		panel.add(board, BorderLayout.CENTER);

		whiteCaptures.setPreferredSize(new Dimension(100,100));
		panel.add(whiteCaptures, BorderLayout.WEST);

		blackCaptures.setPreferredSize(new Dimension(100,100));
		panel.add(blackCaptures, BorderLayout.EAST);

		this.add(panel);
	}

	/**
	 * loadImages
	 * 		called by constructor to read in the image data for pieces
	 * 		and store it for later	
	 */
	private void loadImages() {

		String[] pieces = new String[]{"pawn", "rook", "knight", "bishop", "queen", "king"};

		try {
			for (int j=0; j<pieces.length;j++) {
				
				for (int i=0;i<2;i++) {
					String color = "_white.png";
					if (i == 1) {
						color = "_black.png";
					}
					URL url = new URL(getCodeBase(), "img/" + pieces[j] + color);
					BufferedImage img = ImageIO.read(url);

					if (i == 0) {
						whiteImages.put(pieces[j], img);
					} else {
						blackImages.put(pieces[j], img);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Image loading error");
		}
	}


	/**
	 * getImage
	 * 			returns the correct image for a piece
	 * @param  piece - the piece to get the image of
	 * @return       an image of a chess piece
	 */
	public static BufferedImage getImage(Piece piece) {

		String key = piece.getClass().toString().split(" ")[1].toLowerCase();
		if (piece.isWhite()) {
			return whiteImages.get(key);
		}

		return blackImages.get(key);
	}



	/**
	 * setTurnLabel
	 * 				
	 * @param  label - String to display
	 */
	public static void setTurnLabel(String label) {
		turnLabel.setText(label);
		turnLabel.repaint();
	}


	/**
	 * addCapturedPiece
	 * 		adds captured pieces to the sides of the board
	 * @param  piece - the Piece that was captured
	 */
	public static void addCapturedPiece(Piece piece) {
		Tile tile = new Tile(piece);
		if (piece.isWhite()) {
			whiteCaptures.add(tile);
			whiteCaptures.validate();
		} else {
			blackCaptures.add(tile);
			blackCaptures.validate();
		}

	}

	/**********************************************
	 * 
	 * Interface methods, must be present - even if
	 * they do nothing. Used to respond to user
	 * interaction with the applet
	 * 
	 **********************************************/

	/**
	 * actionPerformed
	 * 		respond to actions (button presses) in the applet
	 * @param e - object that holds information about the event
	 */
	public void actionPerformed(ActionEvent e) {

	}


}