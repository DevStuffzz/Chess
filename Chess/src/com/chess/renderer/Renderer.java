package com.chess.renderer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

import javax.swing.JComponent;

import com.chess.common.Textures;
import com.chess.game.Window;

public class Renderer extends JComponent implements ImageObserver {

	public Renderer() {
		this.setSize(Window.WIDTH, Window.HEIGHT);
		this.setBackground(Color.magenta);
	}
	
	Piece[][] pieces;
	
	public void SetPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int rank = 0; rank < 8; rank++) {
			for(int file = 0; file < 8; file++) {
				Color color = Board.DARK;
				if((rank + file) % 2 == 0) color = Board.LIGHT;
				g.setColor(color);
				g.fillRect(rank*Window.SQUARE_W, file*Window.SQUARE_H, Window.SQUARE_H, Window.SQUARE_H);
			}
		}
		
		if(this.pieces == null) return;
		
		for(int rank = 0; rank < 8; rank++) {
			for(int file = 0; file < 8; file++) {
				if(pieces[rank][file] == null) continue;
				g.drawImage(pieces[rank][file].image, rank * Window.SQUARE_H, file * Window.SQUARE_H, 100, 100, this);
			}
		}
		
	}



	private static final long serialVersionUID = 1L;
}
