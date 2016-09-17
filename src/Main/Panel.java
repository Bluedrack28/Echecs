package Main;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Exception.NoPieceException;
import Game.Cheval;
import Game.Echiquier;
import Game.Echiquier2;
import Game.Fou;
import Game.Piece;
import Game.Pion;
import Game.Reine;
import Game.Roi;
import Game.Tour;

public class Panel extends JPanel	{
	
	private Graphics gr;
	Reine p = new Reine(4,4,true);
	int MouseX;
	int MouseY;
	public Gameplay game;
	public Echiquier2 echec = new Echiquier2();
	
	
	public Panel(Echiquier2 echiquier ){
		echec = echiquier;
		Roi p = new Roi(1,2,true);
		
	}

	public void paintComponent(Graphics g){
		
		Graphisme graph = new Graphisme(g);
		graph.drawEchiquier();
		
		//graph.drawCoordonnees(echec.getPiece(3, 3).possibleMove(echec));
		graph.drawPieces2(echec.getPieces());

	}

	
}
