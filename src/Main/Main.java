package Main;

import javax.swing.JFrame;

import Game.Fou;
import Game.Piece;
import Game.Pion;

public class Main {
	
	public static void main(String[] args) {
		MouseL mouse = new MouseL();
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
