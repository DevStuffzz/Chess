package com.chess.renderer;

import java.awt.Color;

import com.chess.common.Textures;

public class Board {
	public static Color DARK = Color.DARK_GRAY;
	public static Color LIGHT = Color.LIGHT_GRAY;

	public static Piece[][] GenerateDefault() {
		Piece[][] pieces = new Piece[8][8];

		pieces[0][0] = new Piece(0, 0, Textures.B_ROOK);
		pieces[1][0] = new Piece(0, 1, Textures.B_KNIGHT);
		pieces[2][0] = new Piece(0, 2, Textures.B_BISHOP);
		pieces[3][0] = new Piece(0, 3, Textures.B_QUEEN);
		pieces[4][0] = new Piece(0, 4, Textures.B_KING);
		pieces[5][0] = new Piece(0, 5, Textures.B_BISHOP);
		pieces[6][0] = new Piece(0, 6, Textures.B_KNIGHT);
		pieces[7][0] = new Piece(0, 7, Textures.B_ROOK);


		pieces[0][7] = new Piece(7, 0, Textures.W_ROOK);
		pieces[1][7] = new Piece(7, 1, Textures.W_KNIGHT);
		pieces[2][7] = new Piece(7, 2, Textures.W_BISHOP);
		pieces[3][7] = new Piece(7, 3, Textures.W_KING);
		pieces[4][7] = new Piece(7, 4, Textures.W_QUEEN);
		pieces[5][7] = new Piece(7, 5, Textures.W_BISHOP);
		pieces[6][7] = new Piece(7, 6, Textures.W_KNIGHT);
		pieces[7][7] = new Piece(7, 7, Textures.W_ROOK);

		for(int i = 0; i < 8; i++) {
			pieces[i][1] = new Piece(1, i, Textures.B_PAWN);
			pieces[i][6] = new Piece(6, i, Textures.W_PAWN);

		}
		
		return pieces;
	}
}
