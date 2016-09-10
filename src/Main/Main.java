package Main;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import Game.Cheval;
import Game.Coordonnee;
import Game.Echiquier;
import Game.Echiquier2;
import Game.Fou;
import Game.Reine;
import Game.Roi;
import Game.Tour;

public class Main {

	
	public static void main(String[] args) {
		Echiquier2 echec1 = new Echiquier2();
		Cheval r = new Cheval(4,4,true);
		Cheval b = new Cheval(2,3,true);
		echec1.addPiece(r);
		echec1.addPiece(b);
		ArrayList<Coordonnee> f = r.possibleMove(echec1);
		System.out.print(f.size());
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setContentPane(panel);
		frame.setVisible(true);
	
	}

}
