package pieces;

import java.util.ArrayList;

import game.Coordonnee;
import game.Echiquier;

public class Roi extends Piece {

	public Roi(int x, int y, boolean camp) {
		super(x, y, camp);
	}

	@Override
	public String getURLImage() {
		
		if (this.getCamp())
			return "src/pieces/images/bRoi.png";
		else
			return "src/pieces/images/nRoi.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove(Echiquier echec) {
		
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();

		coor.add(new Coordonnee(this.x + 1, this.y + 1));
		coor.add(new Coordonnee(this.x, this.y + 1));
		coor.add(new Coordonnee(this.x, this.y - 1));
		coor.add(new Coordonnee(this.x - 1, this.y));
		coor.add(new Coordonnee(this.x + 1, this.y));
		coor.add(new Coordonnee(this.x - 1, this.y - 1));
		coor.add(new Coordonnee(this.x - 1, this.y + 1));
		coor.add(new Coordonnee(this.x + 1, this.y + 1));
		coor.add(new Coordonnee(this.x + 1, this.y - 1));
		if (this.bigRoque(echec) != null)
			coor.add(this.bigRoque(echec));
		if (this.smallRoque(echec) != null)
			coor.add(this.smallRoque(echec));

		for (int i = 0; i < coor.size(); i++) {
			if (!echec.isInTheCheesBoard(coor.get(i).getX(), coor.get(i).getY())) {
				coor.remove(i);
				i--;
			}
		}

		for (int i = 0; i < coor.size(); i++) {
			if (echec.getPiece(coor.get(i).x, coor.get(i).y) != null) {
				if (echec.getPiece(coor.get(i).x, coor.get(i).y).getCamp() == this.getCamp()) {
					coor.remove(i);
					i--;
				}
			}
		}

		return coor;
	}

	@Override
	public int getIdentity() {
		return 5;
	}

	public Coordonnee smallRoque(Echiquier echec) {
		if (this.getCamp() == echec.getCamp()) {
			if (echec.getPiece(5, 7) == null && echec.getPiece(6, 7) == null && echec.getPiece(7, 7) != null) {
				if (echec.getPiece(7, 7).getIdentity() == Pieces.TOUR && echec.getPiece(7, 7).getCamp() == this.getCamp()){
					if (this.getMovement() == 0 && echec.getPiece(7, 7).getMovement() == 0) {
						return new Coordonnee(6, 7);
					}
				}

			}
		} else {
			if (echec.getPiece(5, 0) == null && echec.getPiece(6, 0) == null && echec.getPiece(7, 7) != null) {
				if (echec.getPiece(7, 0).getIdentity() == Pieces.TOUR && echec.getPiece(7,0).getCamp() == this.getCamp()) {
					if (this.getMovement() == 0 && echec.getPiece(7, 0).getMovement() == 0) {
						return new Coordonnee(6, 0);
					}
				}

			}
		
		
		}
		return null;
	}

	public Coordonnee bigRoque(Echiquier echec) {
		if (this.getCamp() == echec.getCamp()) {
			if (echec.getPiece(1, 7) == null && echec.getPiece(2, 7) == null && echec.getPiece(0, 7) != null) {
				if (echec.getPiece(0, 7).getIdentity() == Pieces.TOUR) {
					if (this.getMovement() == 0 && echec.getPiece(7, 0).getMovement() == 0) {
						return new Coordonnee(2, 7);
					}
				}

			}
		} else {
			if (echec.getPiece(1, 0) == null && echec.getPiece(2, 0) == null && echec.getPiece(0, 0) == null
					&& echec.getPiece(0, 0) != null) {
				if (echec.getPiece(0, 0).getIdentity() == Pieces.TOUR
						&& echec.getPiece(0, 0).getCamp() == this.getCamp()) {
					if (this.getMovement() == 0 && echec.getPiece(7, 0).getMovement() == 0) {
					}
				}
			}
		}
		return null;
	}
}
