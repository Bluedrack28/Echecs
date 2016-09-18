package Main;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import Exception.NoPieceException;
import Game.Cheval;
import Game.Coordonnee;
import Game.Echiquier;
import Game.Echiquier;
import Game.Fou;
import Game.Pion;
import Game.Player;
import Game.Reine;
import Game.Roi;
import Game.Tour;

public class Main {

	
	public static void main(String[] args) {
		
		
		Echiquier echec1 = new Echiquier();
		echec1.resetEchiquier();
	
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec1);
		MouseL mouse = new MouseL(echec1,panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLocation(100, 100);
		frame.getContentPane().add(panel);
		frame.addMouseListener(mouse);
		frame.setVisible(true);
	
	}

}
