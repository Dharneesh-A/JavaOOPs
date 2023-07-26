package polymorphism;

public class Overload {

	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.overload();
		int sum =ol.overload(10,20);
		System.out.print(sum);
	}

	private int overload(int a, int b) {
		System.out.println("overloaded");
		return a+b;
	}

	public void overload() {
		System.out.println("can you overload me ");
	}

}
