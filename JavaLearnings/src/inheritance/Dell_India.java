package inheritance;

// 																	MULTILEVEL INHERITANCE
//				DELL CLASS IS CHILD FOR LAPTOP CLASS  AND PARENT FOR DELL_INDIA CLASS

public class Dell_India extends Dell {
	void touch_screen() {
		System.out.println("bought touch laptop");
	}
	
	public static void main(String[] args) {
	Dell_India dell = new Dell_India();
	dell.touch_screen();
	dell.browse(); // IT   ALSO ACCESS GRAND PARENT CLASS FIELDS AND METHODS
	}

}
