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
import Game.Echiquier;
import Game.Fou;
import Game.Piece;
import Game.Pion;
import Game.Reine;
import Game.Roi;
import Game.Tour;

public class Panel extends JPanel	{
	
	private Graphics gr;
	public boolean drawTakePiece;
	public Gameplay game;
	public Echiquier echec = new Echiquier();
	
	
	public Panel(Echiquier echiquier ){
		echec = echiquier;
		Roi p = new Roi(1,2,true);
		
	}

	public void paintComponent(Graphics g){
		
		Graphisme graph = new Graphisme(g);
		
		graph.drawEchiquier();
		
		//graph.drawCoordonnees(echec.getPiece(3, 3).possibleMove(echec));
		if(drawTakePiece){
			graph.drawTheTakedPiece(echec.pBuffer);
			graph.drawCoordonnees(echec.pBuffer.possibleMove(echec));
		}
		graph.drawPieces2(echec.getPieces());
		
		
	}

	
}
