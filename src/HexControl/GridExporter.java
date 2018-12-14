package HexControl;

import HexMap.*;

public class GridExporter extends Exporter{

	public GridExporter() {
		// TODO Auto-generated constructor stub
	}
	
	public void exportHexGridPretty(HexGrid g) {
		//calls set up
		System.out.println("Exporting Grid __Name__ to Location __Location__");
		for(int i = 0;i<g.getM();i++) {
			for(int j = 0;j<g.getN();j++) {
				System.out.print(g.getHex(i, j).getOccupant());
			}
			//next line
			System.out.println();
		}
			
		//calls tear down
			System.out.println("Exported Grid __Name__ successfully");
			
			
			
		//System.out.println("Issue Exporting Grid __Name__");
		
	}

}
