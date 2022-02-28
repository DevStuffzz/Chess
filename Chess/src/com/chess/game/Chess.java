package com.chess.game;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

import javax.swing.SwingUtilities;

import com.chess.common.Textures;
import com.chess.renderer.Board;
import com.chess.renderer.Piece;
import com.chess.renderer.Renderer;

public class Chess {
	public static Window window;
	// Essentially Main Method, as all it does is call this method
	public static void Start() {
		window = new Window();
		Renderer renderer = new Renderer();
		window.add(renderer);


		Piece[][] pieces = Board.GeneratePieces();

		renderer.SetPieces(pieces);

		boolean running = true;

		window.createBufferStrategy(1);
		BufferStrategy bs = window.getBufferStrategy();

		Graphics g = bs.getDrawGraphics();

		while(running) {

			// Get the mouse position
			Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
			// Make the mouse position relative to the window
			mouseLocation.x -=  window.getLocationOnScreen().x;
			mouseLocation.y -=  window.getLocationOnScreen().y;
			// Create a 1x1 Rectangle at the mouse's position to check collisions
			Rectangle mouseLocationRect = new Rectangle(mouseLocation.x-25, mouseLocation.y-25, 1, 1);

			// TODO: Remove this Debug line
			g.fillRect(mouseLocation.x, mouseLocation.y, 1, 1);

			for(Piece[] _pieces : pieces) {
				for(Piece piece : _pieces) {
					if(piece == null) continue;
					// Create a rectangle for the piece
					Rectangle pieceLocation = new Rectangle(piece.column * Window.SQUARE_H, piece.rank * Window.SQUARE_W, Window.SQUARE_W, Window.SQUARE_H);

					// Check if the rectangles collide
					if(mouseLocationRect.intersects(pieceLocation)) {
						piece.image = Textures.B_PAWN;
						renderer.SetPieces(pieces);
					}
				}
			}
			window.repaint();
		}
	}
}
