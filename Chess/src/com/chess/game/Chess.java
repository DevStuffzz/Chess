package com.chess.game;

import java.awt.BorderLayout;

import com.chess.renderer.Board;
import com.chess.renderer.Renderer;

public class Chess {
	// Essentially Main Method, as all it does is call this method
	public static void Start() {
		Window window = new Window();
		Renderer renderer = new Renderer();
		window.add(renderer);

		Board board = new Board();
		
		renderer.SetPieces(board.pieces);
		
		boolean running = true;
		while(running) {
			window.repaint();
		}
	}
}
