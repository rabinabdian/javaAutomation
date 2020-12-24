package advanced;

public class Wheel {
	private String firm;
	private double airPressure;
	
	public Wheel(String firm, double airPressure) {
		this.firm = firm;
		this.airPressure = airPressure;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public double getAirPressure() {
		return airPressure;
	}

	public void setAirPressure(double airPressure) {
		this.airPressure = airPressure;
	}

	@Override
	public String toString() {
		return "Wheel [firm=" + firm + ", airPressure=" + airPressure + "]";
	}
	
	
}
