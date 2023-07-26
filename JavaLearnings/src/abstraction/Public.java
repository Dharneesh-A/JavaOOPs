package abstraction;

public class Public extends Govt{

	public static void main(String[] args) {
		Public adam =new Public();
		System.out.println(Govt.fine);
		adam.follow_rules();
	}

	@Override
	public void follow_rules() {
		System.out.println("following rules");
	}

}
