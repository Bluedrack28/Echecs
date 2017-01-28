package main;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import exception.NoPieceException;
import game.Coordonnee;
import game.Echiquier;
import game.Player;
import pieces.Cheval;
import pieces.Fou;
import pieces.Piece;
import pieces.Pion;
import pieces.Reine;
import pieces.Roi;
import pieces.Tour;

public class Main {

	
	public static void main(String[] args) {
		
		
		Echiquier echec1 = new Echiquier();
		echec1.resetEchiquier(true);	
		JFrame frame = new JFrame("Echecs");
		Panel panel = new Panel(echec1);
		MouseL mouse = new MouseL(echec1,panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().add(panel);
		frame.addMouseListener(mouse);
		frame.setIconImage(new ImageIcon("pieces/bCheval.png").getImage());
		frame.setVisible(true);
		
	
	}

}
