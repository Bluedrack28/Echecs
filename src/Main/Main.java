package Main;

import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import Game.Echiquier;
import Game.Reine;

public class Main {

	
	public static void main(String[] args) {
		
		Echiquier echec = new Echiquier();
		Reine r = new Reine(4,4,true);
		echec.resetEchiquiquer();
		echec.addPiece(r);
		echec.takePiece(4, 4);
		echec.movePiece(0, 0);
		
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setContentPane(panel);
		frame.setVisible(true);
	
	}

}
