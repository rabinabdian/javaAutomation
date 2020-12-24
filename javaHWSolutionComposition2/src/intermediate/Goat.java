package intermediate;


public class Goat {

	private String color;
	private double age;
	private Beard beard;
	private Tail tail;
	private Leg[] legs;

	public Goat(String color, double age, Beard beard, Tail tail, Leg[] legs) {
		this.color = color;
		this.age = age;
		this.beard = beard;
		this.tail = tail;
		this.legs = legs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Beard getBeard() {
		return beard;
	}

	public void setBeard(Beard beard) {
		this.beard = beard;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	public Leg[] getLegs() {
		return legs;
	}

	public void setLegs(Leg[] legs) {
		this.legs = legs;
	}

}
