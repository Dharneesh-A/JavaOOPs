package interface_demo;

public class Surya implements State_Govt, America{

	public static void main(String[] args) {
		System.out.println(State_Govt.fine);
		State_Govt sg = new Surya();			// DYNAMIC BINDING
		Central_Govt cg  = new Surya();			// DYNAMIC BINDING
		America a = new Surya();
		a.carry_visa();
		sg.twowheeler_rules();
			cg.airport_rules();
			
	}

	@Override
	public void twowheeler_rules() {
		System.out.println("Speed 40 km/hr");
	}

	@Override
	public void airport_rules() {
		System.out.println("passport to enter");
		
	}

	@Override
	public void carry_visa() {
		System.out.println("visa ready");
	}

}
