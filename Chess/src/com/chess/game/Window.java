package com.chess.game;

import javax.swing.JFrame;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	
	public static final int SQUARE_W = WIDTH / 8;
	public static final int SQUARE_H = HEIGHT / 8;
	
	public Window() {
		super("Chess");
		this.setSize(WIDTH+10, HEIGHT+35);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
