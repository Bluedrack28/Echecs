package Main;

import javax.swing.JFrame;

public class Main {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Panel panel = new Panel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
