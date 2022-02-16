package com.chess.renderer;

import java.awt.Image;

public class Piece {
	private int rank, column;
	public Image image;
	
	public Piece(int rank, int column, Image image) {
		this.rank = rank;
		this.column = column;
		this.image = image;
	}
}
