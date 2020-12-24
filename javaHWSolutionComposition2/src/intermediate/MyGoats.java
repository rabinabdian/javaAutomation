package intermediate;

public class MyGoats {

	public static void main(String[] args) {

		Beard b = new Beard("Whith", 35);
		Tail t = new Tail("Brown", 12.4);
		Leg[] legs = new Leg[4];
		legs[0] = new Leg("Whith", 32);
		legs[1] = new Leg("Whith", 32);
		legs[2] = new Leg("Black", 32);
		legs[3] = new Leg("Black", 32);

		Goat g = new Goat("White", 5, b, t, legs);
		System.out.println(g.getBeard().getColor());
		System.out.println(g.getColor());
		System.out.println(g.getTail().getLength());
	}

}
