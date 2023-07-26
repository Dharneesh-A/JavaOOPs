package constructor;

public class Shop {
String name;
	public Shop(String name) {
		//this();  
		this.name=name;
		System.out.println("welcome to "+ name);
	}

	public Shop() {
		this("bmw"); // EXPLICIT CONSTRUCTOR CALL
		System.out.println("cool drinks");
	}

	public static void main(String[] args) {
		Shop adam =new Shop("audi");
		Shop ram =new Shop();

	}

}
