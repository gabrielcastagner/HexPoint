package HexMap;

public class Hex extends Point{
	/**
	 * Empty Hex Constructor - Creates a new Hex with Empty Occupant
	 * @param x
	 * @param y
	 */
	public Hex(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Hex Constructor - used to create a hex known to the user
	 * @param x
	 * @param y
	 * @param o
	 */
	public Hex(int x, int y, char c) {
		super(x, y);
		setOccupant(c);
		// TODO Auto-generated constructor stub
	}
	public void clearHex() {
		this.clearPoint();
	}

}
