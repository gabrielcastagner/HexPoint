package HexMap;

import java.io.File;

/**
 * Class HexGrid
 * 
 * @author Gabriel HexGrid is a grid with Points of Type Hexagon. Each odd row
 *         visually shifted over the left or right by 0.5 of a unit. Adjacencies
 *         vary depending on row index by adding the top left (TL), bottom left
 *         (BL) or Top right (TR), Bottom Right (BR).
 */
public class HexGrid extends Grid {
	private Hex[][] Hexes;

	public HexGrid(String name, int m, int n) {
		// TODO Auto-generated constructor stub
		super(name, m, n);
		this.Hexes = new Hex[m][n];
		File f = new File("Data/" + name + ".hg");
		if (f.exists() && !f.isDirectory()) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					Hexes[i][j] = new Hex(i, j, 'c');
				}
			}
		} else {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					Hexes[i][j] = new Hex(i, j);
				}
			}
		}
		setAdjacencies();
	}

	private void setAdjacencies() {
		boolean even = true;
		for (int i = 0; i < getM(); i++) {
			for (int j = 0; j < getN(); j++) {
				addTop(Hexes[i][j]);
				addRight(Hexes[i][j]);
				addBottom(Hexes[i][j]);
				addLeft(Hexes[i][j]);
				if (even) {
					addTopRight(Hexes[i][j]);
					addBottomRight(Hexes[i][j]);
				} else {
					addTopLeft(Hexes[i][j]);
					addBottomLeft(Hexes[i][j]);
				}
			}
			even = !even;
		}
	}

	public Hex getHex(int x, int y) {
		return this.Hexes[x][y];
	}

}
