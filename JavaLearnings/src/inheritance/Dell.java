package inheritance;

					//				HIERARCHICAL INHERITANCE
				//					SINGLE PARENT (LAPTOP) MULTIPLE CHILD (LENOVO, DELL)

public class Dell extends Laptop{

	void touch_screen() {
		System.out.println("touch screen is available in India");
		
	}
	public static void main(String[] args) {
		Dell dell = new Dell();
		dell.browse();
		System.out.println(dell.rom);
	}

}
