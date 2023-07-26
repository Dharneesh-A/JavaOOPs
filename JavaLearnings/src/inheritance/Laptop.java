package inheritance;

//											INHERITANCE PARENT CLASS
public class Laptop {

	int ram = 8;
	int rom = 500;

	// PROTECTED IS USED BECAUSE IT IS OVERRIDED FROM ANOTHER PACKAGE POLYMORPHISM
	protected void browse() {
		System.out.println("using chrome for browsing");
	}

	// STATIC METHOD CAN'T BE OVERRIDE BECAUSE METHOD OVERRIDE IS BASED
	// ON RUNTIME IF WE USE STSTIC KEYWORD ITS COMPILE TIME

	static void play_games() {
		System.out.println("Playing games");
	}

	public void watch_movie() {
		System.out.println("Movie");
	}

	public static void main(String[] args) {

	}

}
