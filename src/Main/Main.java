package Main;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import Exception.NoPieceException;
import Game.Cheval;
import Game.Coordonnee;
import Game.Echiquier;
import Game.Echiquier2;
import Game.Fou;
import Game.Pion;
import Game.Player;
import Game.Reine;
import Game.Roi;
import Game.Tour;

public class Main {

	
	public static void main(String[] args) {
		
		
		Echiquier2 echec1 = new Echiquier2();
		Player p1 = new Player(echec1,true);
		Player p2 = new Player(echec1,false);
		
		
		
		Fou r = new Fou(3,5,true);
		Tour b = new Tour(5,5,true);
		Cheval h = new Cheval(1,2,true);

		echec1.addPiece(h);
		echec1.addPiece(r);
		echec1.addPiece(b);
		
		
		System.out.println(r.possibleMove(echec1).size());
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec1);
		MouseL mouse = new MouseL(echec1,panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setContentPane(panel);
		frame.addMouseListener(mouse);
		frame.setVisible(true);
	
	}

}
