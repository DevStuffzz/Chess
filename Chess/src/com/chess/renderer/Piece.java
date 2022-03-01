package com.chess.renderer;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.chess.common.PieceType;
import com.chess.common.Textures;

public class Piece  {
	// Public because we want all classes to easily access
	public int rank, column;
	public Image image;
	
	private boolean MouseDown;

	public Piece(int rank, int column, Image image) {
		this.rank = rank;
		this.column = column;
		this.image = image;
	}
	
	public PieceType Type() {
		if(image.equals(Textures.B_ROOK) || image.equals(Textures.W_ROOK)) {
			return PieceType.ROOK;
		} else if(image.equals(Textures.B_KNIGHT) || image.equals(Textures.W_KNIGHT)) {
			return PieceType.KNIGHT;
		} else 	if(image.equals(Textures.B_BISHOP) || image.equals(Textures.W_BISHOP)) {
			return PieceType.BISHOP;
		} else if(image.equals(Textures.B_QUEEN) || image.equals(Textures.W_QUEEN)) {
			return PieceType.QUEEN;
		} else 	if(image.equals(Textures.B_KING) || image.equals(Textures.W_KING)) {
			return PieceType.KING;
		} else if(image.equals(Textures.B_PAWN) || image.equals(Textures.W_PAWN)) {
			return PieceType.PAWN;
		}
		
		
		return PieceType.NONE;
	}

}
