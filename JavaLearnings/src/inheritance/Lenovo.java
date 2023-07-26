package inheritance;

//																	SINGLE  INHERITANCE
//																SINGLE PARENT SINGLE CHILD

public class Lenovo extends Laptop {

	
	public void watch_movie() {
		System.out.println("watching movie");
	}
	
	static void Play_games() {
		System.out.println("playing");
	}
	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.browse();
		System.out.println(lenovo.ram);
		

	}

}
