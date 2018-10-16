package cakes;

public class Vanilla extends AddsDecor{

	public Vanilla(Cakes newCakes) {
		super(newCakes);
		System.out.println("Vanilla added");
	}
	public String getDescription(){
		return tempCakes.getDescription() + ", vanilla";
		
	}
    public double getCost() {
    	System.out.println("Cost of Vanilla: " + 2.00);
		return tempCakes.getCost() +2.00;
    	
    }
}
