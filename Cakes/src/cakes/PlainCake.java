package cakes;

public class PlainCake implements Cakes {
	public String getDescription() {
		return "No Adds";
	}

	@Override
	public double getCost() {
		System.out.println("Cost of Adds: " + 4.00);
	    return 4.00;
	}

}
