package cakes;

public class CakeOrdered {


	public static void main(String[] args) {
	
			
		Cakes PlainCake = new Choclate(new Vanilla(new PlainCake()));
		
		System.out.println("Flavors: " + PlainCake.getDescription());
		System.out.println("Price: " + PlainCake.getCost());
		

	}

}
