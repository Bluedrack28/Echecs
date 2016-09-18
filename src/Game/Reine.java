package Game;

import java.util.ArrayList;

public class Reine extends Piece {

	public Reine(int x, int y, boolean camp) {
		super(x, y, camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getURLImage() {
		// TODO Auto-generated method stub
		if (this.getCamp())
			return "pieces/bReine.png";
		else
			return "pieces/nReine.png";
	}

	@Override
	public ArrayList<Coordonnee> possibleMove(Echiquier echec) {
		// TODO Auto-generated method stub
		ArrayList<Coordonnee> coor = new ArrayList<Coordonnee>();
		Blocker b = new Blocker(echec, this);
		int x = this.x;
		int y = this.y;
		while (true) {
			x++;
			y++;
			if (x >= 8 || y >= 8)
				break;
			if (b.isBlock(x, y)) {
				if (!b.isBlockByAAlly(x, y)) {
					coor.add(new Coordonnee(x, y));
				}
				break;
			}
			coor.add(new Coordonnee(x, y));

		}
		x = this.x;
		y = this.y;
		while (true) {
			x--;
			y--;
			if (x < 0 || y < 0)
				break;
			if (b.isBlock(x, y)) {
				if (!b.isBlockByAAlly(x, y)) {
					coor.add(new Coordonnee(x, y));
				}
				break;
			}
			coor.add(new Coordonnee(x, y));

		}
		x = this.x;
		y = this.y;
		while (true) {
			x--;
			y++;
			if (x < 0 || y >= 8)
				break;
			if (b.isBlock(x, y)) {
				if (!b.isBlockByAAlly(x, y)) {
					coor.add(new Coordonnee(x, y));
				}
				break;
			}
			coor.add(new Coordonnee(x, y));

		}
		x = this.x;
		y = this.y;
		while (true) {
			x++;
			y--;
			if (x >= 8 || y < 0)
				break;
			if (b.isBlock(x, y)) {
				if (!b.isBlockByAAlly(x, y)) {
					coor.add(new Coordonnee(x, y));
				}
				break;
			}
			coor.add(new Coordonnee(x, y));

		}
		for (int i = this.y + 1; i < 8; i++) {

			if (b.isBlock(this.x, i)) {
				if (!b.isBlockByAAlly(this.x, i)) {
					coor.add(new Coordonnee(this.x, i));
				}
				break;
			}

			coor.add(new Coordonnee(this.x, i));

		}
		for (int i = this.x + 1; i < 8; i++) {

			if (b.isBlock(i, this.y)) {
				if (!b.isBlockByAAlly(i, this.y)) {
					coor.add(new Coordonnee(i, this.y));
				}
				break;
			}
			coor.add(new Coordonnee(i, this.y));

		}
		for (int i = this.y - 1; i > -1; i--) {

			if (b.isBlock(this.x, i)) {
				if (!b.isBlockByAAlly(this.x, i)) {
					coor.add(new Coordonnee(this.x, i));
				}
				break;
			}

			coor.add(new Coordonnee(this.x, i));

		}
		for (int i = this.x - 1; i > -1; i--) {

			if (b.isBlock(i, this.y)) {
				if (!b.isBlockByAAlly(i, this.y)) {
					coor.add(new Coordonnee(i, this.y));
				}
				break;
			}
			coor.add(new Coordonnee(i, this.y));

		}

		return coor;
	}

}
