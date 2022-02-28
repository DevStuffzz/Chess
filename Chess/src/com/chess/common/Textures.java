package com.chess.common;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Textures {
	public static final Image W_PAWN = new ImageIcon("assets/images/whitepawn.png").getImage();
	public static final Image W_ROOK = new ImageIcon("assets/images/whiterook.png").getImage();
	public static final Image W_KNIGHT = new ImageIcon("assets/images/whiteknight.png").getImage();
	public static final Image W_BISHOP = new ImageIcon("assets/images/whitebishop.png").getImage();
	public static final Image W_KING = new ImageIcon("assets/images/whiteking.png").getImage();
	public static final Image W_QUEEN = new ImageIcon("assets/images/whitequeen.png").getImage();

	public static final Image B_PAWN = new ImageIcon("assets/images/blackpawn.png").getImage();
	public static final Image B_ROOK = new ImageIcon("assets/images/blackrook.png").getImage();
	public static final Image B_KNIGHT = new ImageIcon("assets/images/blackknight.png").getImage();
	public static final Image B_BISHOP = new ImageIcon("assets/images/blackbishop.png").getImage();
	public static final Image B_KING = new ImageIcon("assets/images/blackking.png").getImage();
	public static final Image B_QUEEN = new ImageIcon("assets/images/blackqueen.png").getImage();

	public static Image Random() {
		Random r = new Random();
		int i = r.nextInt(11 - 1);
		switch(i) {
		case 1:
			return W_PAWN;
		case 2:
			return W_ROOK;
		case 3:
			return W_KNIGHT;
		case 4:
			return W_BISHOP;
		case 5:
			return W_KING;
		case 6:
			return B_PAWN;
		case 7:
			return B_ROOK;
		case 8:
			return B_KNIGHT;
		case 9:
			return B_BISHOP;
		case 10:
			return B_KING;
		case 11:
			return B_QUEEN;
		}
		return null;
	}
}
