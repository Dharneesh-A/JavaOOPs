package abstraction;

import interface_demo.America;

public class Hundred_abstraction extends Govt implements America{

	public static void main(String[] args) {
		Hundred_abstraction h  = new Hundred_abstraction();
		h.carry_visa();
		h.follow_rules();
	}

	@Override
	public void follow_rules() {
		System.out.println("following rules");
		
	}

	@Override
	public void carry_visa() {
		System.out.println("got visa to enter America");
		
	}

}
