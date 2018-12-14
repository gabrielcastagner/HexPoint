package HexControl;

public class Export_Control {
	
	
	
	private GridExporter GE;
	public Export_Control() {
		this.GE = new GridExporter();
	}
	public void exportHandler(Exporter EXP) {
		if(EXP.equals(GE)) {
			//GE.exportGridPretty(g);
		}
	}
	//temporary till we figure this stupid shit out
	public GridExporter getGE() {
		return this.GE;
	}
}
