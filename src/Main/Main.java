package Main;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.sun.glass.events.MouseEvent;

import Exception.NoPieceException;
import Game.Coordonnee;
import Game.Echiquier;
import Game.Echiquier;
import Game.Player;
import Pieces.Cheval;
import Pieces.Fou;
import Pieces.Pion;
import Pieces.Reine;
import Pieces.Roi;
import Pieces.Tour;

public class Main {

	
	public static void main(String[] args) {
		
		
		Echiquier echec1 = new Echiquier();
		echec1.resetEchiquier(true);
	
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec1);
		MouseL mouse = new MouseL(echec1,panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLocation(100, 100);
		frame.getContentPane().add(panel);
		frame.addMouseListener(mouse);
		frame.setIconImage(new ImageIcon("pieces/bCheval.png").getImage());
		frame.setVisible(true);
		
	
	}

}
