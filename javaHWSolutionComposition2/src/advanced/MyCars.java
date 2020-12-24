package advanced;

public class MyCars {

	public static void main(String[] args) {
		Wheel[] wheels = new Wheel[5];
		wheels[0] = new Wheel("GoodYear", 34);
		wheels[1] = new Wheel("GoodYear", 34);
		wheels[2] = new Wheel("GoodYear", 32);
		wheels[3] = new Wheel("GoodYear", 32);
		wheels[4] = new Wheel("GoodYear", 31);
		Radio r = new Radio();
		Car citroen = new Car("Citroen", "C5", 2019, r, wheels);
		System.out.println(citroen.getFirm());
		System.out.println(citroen.toString());
		System.out.println(citroen.getWheels()[4].getAirPressure());
		System.out.println(citroen.getRadioStation());
		//System.out.println(citroen.getRadio().isWorking());
		citroen.getRadio().setWorking(true);
		System.out.println(citroen.getRadioStation());
		//System.out.println(citroen.getRadio().isWorking());
		System.out.println(citroen.getRadioState());
		System.out.println(citroen.getRadioStation());
		citroen.printWheelsStatus();
		citroen.puncher(3);
		citroen.printWheelsStatus();
	}

}
