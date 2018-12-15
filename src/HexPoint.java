import HexControl.GridExporter;
import HexMap.*;

public class HexPoint {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting HexPoint");
		HexGrid HexGrid = new HexGrid("NewHexGrid",2,2);
		GridExporter GE = new GridExporter();
		GE.saveHexGrid(HexGrid);
		System.out.println("New HexGrid Created");
		System.out.println("Finding Shortest Path");
		//BreadthFirstPaths bfspath = new BreadthFirstPaths(HexGrid,HexGrid.getHex(2, 2));
		System.out.println("Exiting HexPoint");
	}

}
