package cakes;

public class Choclate extends AddsDecor{

	public Choclate(Cakes newCakes) {
		super(newCakes);
		System.out.println("Choclate added");
	}
	public String getDescription(){
		return tempCakes.getDescription() + ", choclate";
		
	}
    public double getCost() {
    	System.out.println("Cost of Choclate: " + 2.00);
		return tempCakes.getCost() +2.00;
    	
    }
}
