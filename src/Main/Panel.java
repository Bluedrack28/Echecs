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
import Game.Echiquier2;
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
		
		Roi p = new Roi(1,2,true);
		
	}

	public void paintComponent(Graphics g){
		
		
		
		Echiquier echec = new Echiquier();

//		Echiquier echec = new Echiquier();
//		echec.resetEchiquiquer();
		Graphisme graph = new Graphisme(g);
		echec.addPiece(p);
		echec.takePiece(4, 4);
		echec.movePiece(0, 0);
		graph.drawEchiquier();
//		if(echec.isHereAPiece(1, 1))graph.drawPiece(echec.getPiece(1,1));¨
		
		
		
		graph.drawPieces(echec.getPieces());
		
		
//		System.out.println();
	}

	
}
