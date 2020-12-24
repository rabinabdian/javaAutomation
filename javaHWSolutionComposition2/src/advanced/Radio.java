package advanced;

import java.util.Arrays;

public class Radio {
	private boolean working;
	private Station[] stations;
	private int workingStation;
	
	public Radio() {
		this.working = false;
		this.stations = new Station[3];
		stations[0] = new Station("GalGalatz", 91.8);
		stations[1] = new Station("100FM", 100.0);
		stations[2] = new Station("99FM", 99.0);
		this.workingStation = 0;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public Station[] getStations() {
		return stations;
	}

	public void setStations(Station[] stations) {
		this.stations = stations;
	}

	public int getWorkingStation() {
		return workingStation;
	}

	public void setWorkingStation(int workingStation) {
		this.workingStation = workingStation;
	}

	@Override
	public String toString() {
		return "Radio [working=" + working + ", stations=" + Arrays.toString(stations) + ", workingStation="
				+ workingStation + "]";
	}
	
}
