package com.chess.renderer;

import java.awt.Color;

import com.chess.common.Textures;

public class Board {
	public static Color DARK = Color.DARK_GRAY;
	public static Color LIGHT = Color.LIGHT_GRAY;
	
	public Piece[][] pieces = new Piece[8][8];
	
	public Board() {
		GeneratePieces();
	}
	
	public void GeneratePieces() {
		for(int file = 0; file < 8; file++) {
			for(int rank = 0; rank < 8; rank++) {
				// Special Pieces
				// White Pieces
				if(file == 0) {
					switch(rank) {
					case 0:
					case 7:
						pieces[rank][file] = new Piece(file, rank, Textures.W_ROOK);
						break;
					case 1:
					case 6:
						pieces[rank][file] = new Piece(file, rank, Textures.W_KNIGHT);
						break;
					case 2:
					case 5:
						pieces[rank][file] = new Piece(file, rank, Textures.W_BISHOP);
						break;
					case 3:
						pieces[rank][file] = new Piece(file, rank, Textures.W_QUEEN);
						break;
					case 4:
						pieces[rank][file] = new Piece(file, rank, Textures.W_KING);
						break;
					}
				}
				
				if(file == 7) {
					switch(rank) {
					case 0:
					case 7:
						pieces[rank][file] = new Piece(file, rank, Textures.B_ROOK);
						break;
					case 1:
					case 6:
						pieces[rank][file] = new Piece(file, rank, Textures.B_KNIGHT);
						break;
					case 2:
					case 5:
						pieces[rank][file] = new Piece(file, rank, Textures.B_BISHOP);
						break;
					case 3:
						pieces[rank][file] = new Piece(file, rank, Textures.B_KING);
						break;
					case 4:
						pieces[rank][file] = new Piece(file, rank, Textures.B_QUEEN);
						break;
					}
				}
				
				
				// Pawns
				if(rank == 1) {
					pieces[file][rank] = new Piece(file, rank, Textures.W_PAWN);
				}
				if(rank == 6) {
					pieces[file][rank] = new Piece(file, rank, Textures.B_PAWN);
				}
			}
		}
	}
}
