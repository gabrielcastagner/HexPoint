package HexMap;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Abstract Class Grid
 * 
 * @author Gabriel Grids are made up of two dimensional products of Points. Kept
 *         a General Grid is used to keep track of this
 */
public abstract class Grid {
	private String SaveName;
	private int m; // x position
	private int n; // y position
	private Point[][] Points;

	public Grid(String name, int m, int n) {
		this.SaveName = name;
		this.m = m;
		this.n = n;
		this.Points = new Point[m][n];
	}

	public void ClearPoint(int m, int n) {
		this.Points[m][n].clearPoint();
	}

	public int getM() {
		return this.m;
	}

	public int getN() {
		return this.n;
	}
	public String getSaveName() {
		return this.SaveName;
	}

	public void ClearGrid() {
		// TODO create an iterator through a list of points
		for (int i = 0; i < this.m; i++) {
			for (int j = 0; j < this.n; j++) {
				ClearPoint(i, j);
			}
		}
	}

	public Point getPoint(int x, int y) {
		return this.Points[x][y];
	}

	/**
	 * isOutside returns a boolean determining if the desired point is outside of
	 * the grid
	 * 
	 * @param p
	 *            the point that it is referring to
	 * @return true or false if the desired point is outside of the grid
	 */
	public boolean isOutside(int x, int y) {
		//minus ones for the array index
		if(x< 0 || x> this.m-1) {
			return true;
		}else if(y<0 || y>this.n-1) {
			return true;
		} else
			return false;
	}

	private void setAdjacencies() {

	}

	public void addTop(Point p) {
		if (!isOutside(p.getX(), p.getY() + 1))
			p.addAdjancency(getPoint(p.getX(), p.getY() + 1));
	}

	public void addTopRight(Point p) {
		if (!isOutside(p.getX() + 1, p.getY() + 1))
			p.addAdjancency(getPoint(p.getX() + 1, p.getY() + 1));
	}

	public void addRight(Point p) {
		if (!isOutside(p.getX() + 1, p.getY()))
			p.addAdjancency(getPoint(p.getX() + 1, p.getY()));
	}

	public void addBottomRight(Point p) {
		if (!isOutside(p.getX() + 1, p.getY() - 1))
			p.addAdjancency(getPoint(p.getX() + 1, p.getY() - 1));
	}

	public void addBottom(Point p) {
		if (!isOutside(p.getX(), p.getY() - 1))
			p.addAdjancency(getPoint(p.getX(), p.getY() - 1));
	}

	public void addBottomLeft(Point p) {
		if (!isOutside(p.getX() - 1, p.getY() - 1))
			p.addAdjancency(getPoint(p.getX() - 1, p.getY() - 1));
	}

	public void addLeft(Point p) {
		if (!isOutside(p.getX()-1, p.getY()))
			p.addAdjancency(getPoint(p.getX()-1, p.getY()));
	}

	public void addTopLeft(Point p) {
		if (!isOutside(p.getX() - 1, p.getY() + 1))
			p.addAdjancency(getPoint(p.getX() - 1, p.getY() + 1));
	}

	public void exportGrid() {
		// Initialize the Scanner and Writers
		// Create a new file if it doesn't exist
		// set up the Forloop
		// output the owners
		// save txt file
	}
	
}
