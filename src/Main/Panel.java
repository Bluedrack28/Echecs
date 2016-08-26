package Main;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Game.Cheval;
import Game.Echiquier;
import Game.Fou;
import Game.Piece;
import Game.Pion;
import Game.Reine;
import Game.Roi;
import Game.Tour;

public class Panel extends JPanel{
	
	private Graphics gr;
	Reine p = new Reine(4,4,true);
	int MouseX;
	int MouseY;
	public Gameplay game;
	public Panel(){
		
		Pion p = new Pion(1,100,true);
		
	}

	public void paintComponent(Graphics g){
		
		
		Echiquier echec = new Echiquier();
		echec.resetEchiquiquer();
		Graphisme graph = new Graphisme(g);
		
		graph.drawEchiquier();
		if(echec.isHereAPiece(1, 1))graph.drawPiece(echec.getPiece(1,1));
		//graph.drawPiece(echec.getPiece(4,3));

	}

	
}
