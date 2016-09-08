package Main;

import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import Game.Echiquier;
import Game.Echiquier2;
import Game.Reine;
import Game.Tour;

public class Main {

	
	public static void main(String[] args) {
		Echiquier2 echec1 = new Echiquier2();
		
		Echiquier echec = new Echiquier();
		Tour r = new Tour(4,4,true);
		echec1.addPiece(r);
		echec.resetEchiquiquer();
		echec.addPiece(r);
		echec1.takePiece(4, 4);
		echec1.movePiece(0, 4);
		System.out.print(echec1.getPiece(4, 4));
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setContentPane(panel);
		frame.setVisible(true);
	
	}

}
