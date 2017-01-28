package main;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import exception.NoPieceException;
import game.Echiquier;
import game.Gameplay;
import pieces.Cheval;
import pieces.Fou;
import pieces.Piece;
import pieces.Pion;
import pieces.Reine;
import pieces.Roi;
import pieces.Tour;

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
		
		if(drawTakePiece){
			graph.drawTheTakedPiece(echec.pBuffer);
			graph.drawCoordonnees(echec.pBuffer.possibleMove(echec));
		}
		
		//graph.drawTheEnd(true);
		graph.drawPieces2(echec.getPieces());
		
		
	}

	
}
