package com.chess.renderer;

import java.awt.Color;

import com.chess.common.Textures;

public class Board {
	public static Color DARK = Color.DARK_GRAY;
	public static Color LIGHT = Color.LIGHT_GRAY;

	public static Piece[][] GeneratePieces() {
		Piece[][] pieces = new Piece[8][8];


		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				pieces[x][y] = new Piece(y, x, Textures.W_QUEEN);
			}
		}

		return pieces;
	}
}
