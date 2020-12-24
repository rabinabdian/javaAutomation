package advanced;

import java.util.Arrays;

public class Car {
	private String firm;
	private String model;
	private long year;
	private Radio radio;
	private Wheel[] wheels;
	
	public Car(String firm, String model, long year, Radio radio, Wheel[] wheels) {
		this.firm = firm;
		this.model = model;
		this.year = year;
		this.radio = radio;
		this.wheels = wheels;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Car [firm=" + firm + ", model=" + model + ", year=" + year + ", radio=" + radio + ", wheels="
				+ Arrays.toString(wheels) + "]";
	}
	
	
	public boolean getRadioState() {
		return getRadio().isWorking();
	}
	
	public String getRadioStation() {
		if (getRadio().isWorking()) {
			int currentStationNumber = getRadio().getWorkingStation();
			String sationName = getRadio().getStations()[currentStationNumber].getName();
			return sationName;
		} else
			return "Radio is off";
	}
	
	public void printWheelsStatus() {
		for (int i = 0; i < wheels.length; i++) {
			System.out.println(wheels[i]);
		}
	}
	
	public void puncher(int position) {
		getWheels()[position].setAirPressure(0);
		Wheel w = getWheels()[position];
		getWheels()[position]  = getWheels()[4];
		getWheels()[4] = w;
	}
	
	
}
