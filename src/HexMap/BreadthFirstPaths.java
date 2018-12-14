package HexMap;

import java.util.ArrayList;

public class BreadthFirstPaths {

	private boolean[][] marked; // Is a shortest path to this vertex known?
	private Point[][] edgeTo; // last vertex on known path to this vertex
	private final Point s; // source

	public BreadthFirstPaths(Grid G, Point s) {
		marked = new boolean[G.getM()][G.getN()];
		edgeTo = new Point[G.getM()][G.getN()];
		this.s = s;
		bfs(G, s);
	}

	private void bfs(Grid G, Point s) {
		ArrayList<Point> queue = new ArrayList<Point>();
		marked[s.getX()][s.getY()] = true; // Mark the source
		queue.add(s); // and put it on the queue.
		while (!queue.isEmpty()) {
			Point v = queue.get(queue.size()-1); // Remove next vertex from the queue.
			queue.remove(v);
			for (Point w : G.getPoint(v.getX(), v.getY()).getAdjancencies())
				if (!marked[w.getX()][w.getY()]) // For every unmarked adjacent vertex,
				{
					edgeTo[w.getX()][w.getY()] = v; // save last edge on a shortest path,
					marked[w.getX()][w.getY()] = true; // mark it because path is known,
					queue.add(w); // and add it to the queue.
				}
		}
	}

	public boolean hasPathTo(int v, int w) {
		return marked[v][w];
	}

}
