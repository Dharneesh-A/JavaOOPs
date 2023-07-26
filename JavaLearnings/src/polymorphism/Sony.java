package polymorphism;

import inheritance.Laptop;

public class Sony extends Laptop{

	
	  public void browse() { 
		  System.out.println("overrided method"); 
		  }

	public static void main(String[] args) {
	Sony sony = new Sony();
	sony.browse();
	sony.watch_movie();
	}

}
