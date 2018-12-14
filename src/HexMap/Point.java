package HexMap;

import java.util.ArrayList;

public abstract class Point {
	private int x;
	private int y;
	private char Occupant;
	private ArrayList<Point> Adjacent;
	private int Edges;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		setOccupant('0');
		this.Adjacent = new ArrayList<Point>();
		this.Edges = this.Adjacent.size();
	}
	public void clearPoint() {
		this.Occupant = '0';
	}
	public void setOccupant(char c) {
		this.Occupant = c;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public char getOccupant() {
		return this.Occupant;
	}
	public void addAdjancency(Point p) {
		this.Adjacent.add(p);
		this.Edges = this.Edges +1;
	}
	public void removeAdjancency(Point p) {
		this.Adjacent.remove(p);// this uses an object, not point, may not work
		this.Edges = this.Edges -1;
	}
	public ArrayList<Point> getAdjancencies() {
		return this.Adjacent;
	}
	public int getEdges() {
		return this.Edges;
	}
}
