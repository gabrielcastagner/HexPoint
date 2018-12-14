package HexMap;

public class Edge {
	
	private Point[] Points;
	
	public Edge(Point p, Point d) {
		this.Points = new Point[]{p,d};
	}
	
	public Point getNextPoint() {
		return this.Points[1];
	}
	public Point getCurrentPoint() {
		return this.Points[0];
	}
}
