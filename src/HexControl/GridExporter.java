package HexControl;

import java.io.*;
import HexMap.*;

public class GridExporter extends Exporter {

	public GridExporter() {
		// TODO Auto-generated constructor stub
	}

	public String exportHexGridPretty(HexGrid g) {
		// calls set up
		String export = "";
		System.out.println("Exporting Grid " + g.getSaveName());
			for (int i = 0; i < g.getM(); i++) {
				for (int j = 0; j < g.getN(); j++) {
					System.out.print(g.getHex(i, j).getOccupant());
					export = export + g.getHex(i, j).getOccupant();
				}
				// next line
				System.out.println();
				export = export + "\n";
			}
		return export;
	}

	public void saveHexGrid(HexGrid g) {

		String fileName = g.getSaveName() + ".hg";
		String pathName = "Data/" + fileName;
		System.out.println("Exporting Grid " + g.getSaveName() + " to Location " + fileName);
		try {
			FileWriter fileWriter = new FileWriter(pathName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("M = "+g.getM() + ", "+ "N = "+g.getN());
			bufferedWriter.newLine();
			bufferedWriter.write(exportHexGridPretty(g));
			// close file
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing file to " + fileName);
		}
		// calls tear down
		System.out.println("Exported Grid " + fileName + " successfully");

	}

}
