package com.chess.game;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

import javax.swing.SwingUtilities;

import com.chess.common.Textures;
import com.chess.renderer.Board;
import com.chess.renderer.Piece;
import com.chess.renderer.Renderer;

public class Chess implements MouseListener{
	
	public static Window window;
	public boolean MouseDown = false;
	
	// Essentially Main Method, as all it does is call this method
	public static void Start() {
		Chess This = new Chess();
		window = new Window();
		Renderer renderer = new Renderer();
		window.add(renderer);
		window.addMouseListener(This);


		Piece[][] pieces = Board.GenerateDefault();

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
					Rectangle pieceLocation = new Rectangle(piece.column * 100, piece.rank * 100, 100, 100);

					// Check if the rectangles collide
					if(mouseLocationRect.intersects(pieceLocation)) {
						if(This.MouseDown) {
							System.out.println(piece.Type());
						}
					}
				}
			}
			renderer.SetPieces(pieces);
			window.repaint();
		}
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		MouseDown = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		MouseDown = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
