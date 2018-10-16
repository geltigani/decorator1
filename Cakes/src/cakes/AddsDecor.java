package cakes;

abstract class AddsDecor implements Cakes {
	protected Cakes tempCakes;
	
public AddsDecor (Cakes newCakes){
	
	tempCakes = newCakes;
}
public String getDescription() {
	return tempCakes.getDescription();		
}
public double getCost() {
	return tempCakes.getCost();
  }
}
