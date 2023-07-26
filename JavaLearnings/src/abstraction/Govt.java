package abstraction;

public abstract class Govt {

	static int fine = 1000;
	public abstract void follow_rules();
	
	public  void pay_salary () {
		// Govt g = new Govt() ;		OBJ CANT BE CREATE FOR ABSTRACT CLASS
		System.out.println("salay credited to officials");
	}
	
}
